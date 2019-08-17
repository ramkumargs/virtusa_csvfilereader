package com.virtusa.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.virtusa.Constants;
import com.virtusa.ICSVFileReader;
import com.virtusa.exception.InvalidFileException;

public class CSVFileReader implements ICSVFileReader, Constants {

	List<String> fileLines = new ArrayList<String>();
	
	public void readFile(String fileName) {
		 String csvFile = fileName;
		 BufferedReader br = null;
		 String line = "";
		 
		 try {
			 	URL url = getClass().getClassLoader().getResource(csvFile);
			 	if (null == url) {
					throw new InvalidFileException(MESSAGE);
			 	}
	            br = new BufferedReader(new FileReader(url.getFile()));
	            
	            while ((line = br.readLine()) != null) {

	            	fileLines.add(line);

	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	}

	public String displayElement(int lineNumber, String element) {
		int index = Arrays.asList(fileLines.get(0).split(",")).indexOf(element) ;
		return Arrays.asList(fileLines.get(lineNumber).split(",")).get(index);
	}

}
