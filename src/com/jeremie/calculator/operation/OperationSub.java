package com.jeremie.calculator.operation;

public class OperationSub extends Operation{

	@Override
	public double GetResult() throws Exception {
		return get_numberA() - get_numberB();
	}

}
