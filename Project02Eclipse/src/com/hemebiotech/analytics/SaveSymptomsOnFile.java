package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SaveSymptomsOnFile implements ISymptomWriter {
	
	private String filename;

/**
 * Write results in a file
 * @param name of the file to save into
 */
	public SaveSymptomsOnFile (String filename) {
		this.filename = filename;
	}



	@Override
	public Map<String, Integer> displaySymptoms(Map<String, Integer> symptomsMap) {
		Map<String, Integer> treeMap = new TreeMap<>(symptomsMap);
	
		try {
			FileWriter writer = new FileWriter(filename);
			for (String str : treeMap.keySet()) {
				writer.write(str + "=" + treeMap.get(str) + "\n");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		return null;
	}

	
}