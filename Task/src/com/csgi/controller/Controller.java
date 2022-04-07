package com.csgi.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import com.csgi.exception.CSGIException;
import com.csgi.service.ServiceImpl;

/**
 * Used Only for Input and Output Purpose
 * @author nuteshr
 *
 */
public class Controller {
	/**
	 * Defining final variable so that if required in future
	 * value can be passed from anywhere without interfering the code
	 */
	private static ServiceImpl service = new ServiceImpl();
	final static String FILE_NAME = "C:\\Users\\nuteshr\\OneDrive - AMDOCS\\Backup Folders\\Documents\\PersonalProjects\\Task\\Task\\src\\com\\csgi\\input\\Names.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;
	/**
	 * Execution Starts from here
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			/**
			 * Taking Input
			 */
			Path path = Paths.get(FILE_NAME);
			ArrayList<String> words=(ArrayList<String>) Files.readAllLines(path, ENCODING);
			/**
			 * Passing inputs to methods
			 */
			Integer wordsStartingWithM = service.wordsStartingWithM(words);
			List<String> wordsGreaterThan5 = service.wordsGreaterThan5(words);
			/**
			 * Printing Output
			 */
			System.out.println("No of words starting with m = "+wordsStartingWithM);
			System.out.println("Words greater than 5 are = " + wordsGreaterThan5);
		} catch (CSGIException | IOException e) {
			System.out.println(e.getMessage());
		}    
	}
}
