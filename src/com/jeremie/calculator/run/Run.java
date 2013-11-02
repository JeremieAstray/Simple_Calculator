package com.jeremie.calculator.run;

import com.jeremie.calculator.operation.Operation;
import com.jeremie.calculator.operation.factory.OperationFactory;

public class Run {

	public static void main(String[] args) {
		Operation Oper;
		Oper = OperationFactory.createOperation("+");
		Oper.set_numberA(2);
		Oper.set_numberB(6);
		try{
			double result = Oper.GetResult();
			System.out.println(result);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
