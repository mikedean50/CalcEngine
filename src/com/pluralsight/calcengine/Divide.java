package com.pluralsight.calcengine;

public class Divide extends CalculateBase {

	public Divide() {};
	public Divide(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}

	@Override
	public void Calculate() {
		double value = getLeftVal() / getRightVal();
		setResult(value);
	}
}
