package com.virtusa;

import java.util.Scanner;

import com.virtusa.impl.CSVFileReader;

public class ReadFileAPI {

	public static void main(String[] args) {
		ICSVFileReader fileReader = new CSVFileReader();
		System.out.println("File Name: ");
//		Scanner sn = new Scanner(System.in);
//		String fileName = sn.next();

//		System.out.println("Line No.: ");
//		int lineNo = sn.nextInt();
		
//		System.out.println("Element Name.: ");
//		String elementName = sn.next();
		
		// fileReader.readFile(fileName);
		fileReader.readFile("test.csv");
		
		//String displayLine = fileReader.DisplayLine(lineNo, elementName);
		String displayLine = fileReader.displayElement(3, "BALL_2");
		System.out.println("Element Value :" + displayLine);
	}

}
