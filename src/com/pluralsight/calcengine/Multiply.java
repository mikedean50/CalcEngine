package com.pluralsight.calcengine;

public class Multiply extends CalculateBase{

	public Multiply() {};
	public Multiply(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}

	@Override
	public void Calculate() {
		double value = getLeftVal() * getRightVal();
		setResult(value);
	}
}
