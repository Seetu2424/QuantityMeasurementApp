package com.quatity.measurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import controller.Controller;
import enumsImpl.LengthUnit;
import models.QuantityLength;
import repository.Repository;
import repositoryImpl.DatabaseRepository;
import serviceImpl.ServiceImpl;
import service.*;
import dto.QuantityDTO;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class MeasurementApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(MeasurementApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(
				MeasurementApplication.class,
				args
		);

		Repository repository =
				new DatabaseRepository();

		var service =
				new ServiceImpl(repository);

		var controller =
				new Controller(service);

		// Example
		var result = controller.performAdd(
				new QuantityDTO(
						1.0,
						"FEET",
						"LENGTH"
				),
				new dto.QuantityDTO(
						12.0,
						"INCH",
						"LENGTH"
				),
				"FEET"
		);

		LOGGER.info(
				"Result Value: {}",
				result.getValue()
		);
	}
}