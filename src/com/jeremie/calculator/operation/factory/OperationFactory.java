package com.jeremie.calculator.operation.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.jeremie.calculator.operation.*;

public class OperationFactory {
	
	public static Operation createOperation(String Operation){
		Operation Oper = null;
		Oper = getOperation(Operation);
		/*
		switch(Operation){
		case("+"):
			Oper = new OperationAdd();
			break;
		case("-"):
			Oper = new OperationSub();
			break;
		case("*"):
			Oper = new OperationMul();
			break;
		case("/"):
			Oper = new OperationDiv();
			break;
		case("|"):
			Oper = new OperationSqrt();
			break;
		}*/
		return Oper;
	}
	
	private static Properties getProperties(){
		File pFile = new File(
				"d:/temporary/programme/java OO进阶/Simple_Calculator/src/com/jeremie/calculator/run/Operation.properties"); 
		Properties p = new Properties();
		try {
			FileInputStream pInStream = null;
			pInStream = new FileInputStream(pFile);
			p.load(pInStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	private static Operation getOperation(String Operation){
		Operation Oper= null;
		Properties p = getProperties();
		Operation = p.getProperty(Operation);
		try {
			Class<?> c = Class.forName(Operation);
			Oper = (com.jeremie.calculator.operation.Operation) c.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return Oper;
	}
}