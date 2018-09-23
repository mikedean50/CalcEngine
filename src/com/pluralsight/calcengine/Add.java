package com.pluralsight.calcengine;

public class Add extends CalculateBase {

	public Add() {};
	public Add(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}

	@Override
	public void Calculate() {
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}
}
