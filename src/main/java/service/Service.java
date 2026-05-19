package service;

import dto.QuantityDTO;

public interface Service {

	 QuantityDTO add(QuantityDTO q1, QuantityDTO q2, String targetUnit);

	    QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2, String targetUnit);

	    QuantityDTO divide(QuantityDTO q1, QuantityDTO q2);

	    QuantityDTO convert(QuantityDTO q, String targetUnit);

	    QuantityDTO compare(QuantityDTO q1, QuantityDTO q2);
	}