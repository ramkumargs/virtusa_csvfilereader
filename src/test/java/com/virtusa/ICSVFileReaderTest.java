package com.virtusa;

import org.junit.Assert;

import org.junit.Test;

import com.virtusa.impl.CSVFileReader;

public class ICSVFileReaderTest {

	@Test
	public void testReadFile() {
		ICSVFileReader csvReader = new CSVFileReader();
		csvReader.readFile("test.csv");
	}

	@Test
	public void testDisplayLine() {
		ICSVFileReader csvReader = new CSVFileReader();
		csvReader.readFile("test.csv");
		String displayLine = csvReader.displayElement(3, "BALL_2");
		Assert.assertEquals("16", displayLine);
	}

}
