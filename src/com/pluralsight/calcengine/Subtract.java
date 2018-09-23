package com.pluralsight.calcengine;

public class Subtract extends CalculateBase{

	public Subtract() {};
	public Subtract(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}

	@Override
	public void Calculate() {
		double value = getLeftVal() - getRightVal();
		setResult(value);
	}
}
