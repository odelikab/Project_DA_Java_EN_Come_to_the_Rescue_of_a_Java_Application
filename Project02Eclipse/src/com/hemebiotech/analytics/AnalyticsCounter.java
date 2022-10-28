package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;


public class AnalyticsCounter {


	public static void main(String args[]) {
		
		String inputfile = "Project02Eclipse/symptoms.txt";

//		Lecture fichier et extraction des symptoms
		ISymptomReader readSymptom = new ReadSymptomDataFromFile(inputfile);
		List<String> listeSymptoms = readSymptom.getSymptoms();
		System.out.println(listeSymptoms);
//		compteur symptoms
		SymptomsCounter nombreSymptoms=new SymptomsCounter();
		nombreSymptoms.count(readSymptom);
		//affichage dans result.out
		ISymptomWriter saveSymptoms = new SaveSymptomsOnFile(outfile);
		saveSymptoms.displaySymptoms(nombreSymptoms.count(readSymptom));

	}


}
