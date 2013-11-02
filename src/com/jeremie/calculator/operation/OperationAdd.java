package com.jeremie.calculator.operation;

public class OperationAdd extends Operation {

	@Override
	public double GetResult() {
		return get_numberA() + get_numberB();
	}
}
