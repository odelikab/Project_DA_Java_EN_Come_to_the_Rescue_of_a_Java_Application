package com.hemebiotech.analytics;

import java.util.Map;

/**
 * displays the symptoms
 * the return value is an alphabetical ordered map
 * 
 */
public interface ISymptomWriter {
	/**
	 * 
	 * @return all Symptoms sort by alphabetic with their count for output file
	 */
	
	Map<String, Integer> displaySymptoms(Map<String, Integer> m);
	
}
