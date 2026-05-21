package com.quatity.measurement;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.persistence.autoconfigure.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//
//
//
//@SpringBootApplication(scanBasePackages = {
//		"QuantityMeasurementApp",
//		"com.quatity.measurement"
//})
//@EntityScan("com.quatity.measurement.entity")
//@EnableJpaRepositories("com.quatity.measurement.repository")
//public class MeasurementApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MeasurementApplication.class, args);
//	}
//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "QuantityMeasurementApp",
        "com.quatity.measurement"
})

@EntityScan("com.quatity.measurement.entity")

@EnableJpaRepositories(
        "com.quatity.measurement.repository"
)

public class MeasurementApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                MeasurementApplication.class,
                args
        );
    }
}