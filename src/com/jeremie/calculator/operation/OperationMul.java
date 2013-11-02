package com.jeremie.calculator.operation;

public class OperationMul extends Operation{

	@Override
	public double GetResult() {
		return get_numberA() * get_numberB();
	}
}
