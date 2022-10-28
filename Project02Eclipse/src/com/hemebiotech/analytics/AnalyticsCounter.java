package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;

	public static void main(String args[]) {
		
		ReadFromFile();
		saveOnFile();
	}

	public static void ReadFromFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
			String line = reader.readLine();

			int i = 0;
			int headCount = 0;
			while (line != null) {
				i++;
				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headCount++;
					System.out.println("number of headaches: " + headCount);
				} else if (line.equals("rush")) {
					rashCount++;
				} else if (line.contains("pupils")) {
					pupilCount++;
				}

				line = reader.readLine();
			}
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// generate output file
	public static void saveOnFile() {
		FileWriter writer;
		try {
			writer = new FileWriter("result.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
