package com.csgi.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.csgi.exception.CSGIException;
import com.csgi.service.ServiceImpl;

/**
 * Used for Testing Purpose for Service Class
 * @author nuteshr
 *
 */
class ServiceTest {

	private static ServiceImpl service = new ServiceImpl();

	/**
	 * Defining Constants for Testing Purpose
	 */
	final List<String> stringsWithM = new ArrayList<String>(
			Arrays.asList("March","may","Month"));
	final Integer countOfstringsWithM = stringsWithM.size();
	final List<String> stringsGreaterThan5 = new ArrayList<String>(
			Arrays.asList("bottle","cooler","almirah"));
	final Integer countOfstringsGreaterThan5 = stringsGreaterThan5.size();
	final List<String> stringsWithoutM = new ArrayList<String>(
			Arrays.asList("word1","word2","word3"));
	final Integer countOfstringsWithoutM = 0;
	final List<String> stringsnotGreaterThan5 = new ArrayList<String>(
			Arrays.asList("sky","fly","try"));
	final Integer countOfstringsnotGreaterThan5 = 0;
	
	/**
	 * Test method for wordsStartingWithM method
	 */
	@Test
	public void wordsWithM() {
	try {
		/**
		 * Matching Positive Test Scenario for wordsStartingWithM method
		 */
		Assert.assertEquals(countOfstringsWithM, service.wordsStartingWithM(stringsWithM));
		/**
		 * Matching Negative Test Scenario for wordsStartingWithM method
		 */
		Assert.assertEquals(countOfstringsWithoutM, service.wordsStartingWithM(stringsWithoutM));
	} catch (CSGIException e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
	}
	/**
	 * Test method for wordsGreaterThan5 method
	 */
	@Test
	public void wordsGreaterThan5() {
		try {
			/**
			 * Matching Positive Test Scenario for wordsGreaterThan5 method
			 */
			Assert.assertEquals(stringsGreaterThan5, service.wordsGreaterThan5(stringsGreaterThan5));
			
			/**
			 * Matching Negative Test Scenario for wordsGreaterThan5 method
			 */
			Assert.assertNotEquals(stringsnotGreaterThan5, service.wordsGreaterThan5(stringsnotGreaterThan5));
		} catch (CSGIException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
