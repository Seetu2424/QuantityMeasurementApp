package QuantityMeasurementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quatity.measurement.enums.LengthUnit;
import com.quatity.measurement.models.QuantityLength;

@SpringBootApplication
public class MeasurementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeasurementApplication.class, args);
		
		QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
		QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCH);

		if (q1.equals(q2)) {
			
			
			System.out.println("Equal (true)");
		} else {
			System.out.println("Not Equal (false)");
			
		}
	}
}
