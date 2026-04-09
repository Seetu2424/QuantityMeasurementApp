package com.quatity.measurement.enums;

public enum LengthUnit {
	
	FEET(1.0),
	INCH(1.0/12),
	YARDS(36.0),
	CENTIMETERS(0.393701);
	
	private final double toFeetFactor;
	
	LengthUnit(double toFeetFactor) {
		this.toFeetFactor = toFeetFactor;
	}
	
	public double toFeet(double value) {
		return value * toFeetFactor;
	}
	
	public double fromFeet(double value) {
	       return value / toFeetFactor;  
	}
}
