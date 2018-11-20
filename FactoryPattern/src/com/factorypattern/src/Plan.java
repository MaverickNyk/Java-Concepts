package com.factorypattern.src;

public abstract class Plan {
	protected double rate = 0;
	
	abstract void setRate();
	
	public double calculatebill(int units) {
		return units * rate;
	}

}
