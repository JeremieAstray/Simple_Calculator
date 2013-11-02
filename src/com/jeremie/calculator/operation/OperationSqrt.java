package com.jeremie.calculator.operation;

public class OperationSqrt extends Operation{

	@Override
	public double GetResult() {
		return Math.sqrt(get_numberA());
	}
}
