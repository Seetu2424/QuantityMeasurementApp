package com.quatity.measurement;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quatity.measurement.enums.LengthUnit;
import com.quatity.measurement.models.QuantityLength;

@SpringBootApplication
public class MeasurementApplication {
	
	public static void main(String[] args) {
	
		QuantityLength q1 = new QuantityLength(2.0, LengthUnit.CENTIMETERS);
		QuantityLength q2 = new QuantityLength(2.0, LengthUnit.YARDS);

		System.out.println(q1.equals(q2));
		
		}
}
