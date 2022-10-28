package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;

public class SymptomsCounter {

	/**
	 * counts symptoms from list
	 * @param List of symptoms
	 * @return map of symptoms and their quantities
	 */
	public Map<String, Integer> count(ISymptomReader readSymptom) {

		Map<String, Integer> symptoms = new HashMap<>();

		for (String symp : readSymptom.getSymptoms()) {
			Integer quantity;
			if (symptoms.containsKey(symp)) {
				quantity = symptoms.get(symp) + 1;
				symptoms.put(symp, quantity);
			} else
				symptoms.put(symp, 1);
		}

		System.out.println(symptoms);

		return symptoms;
	}

}
