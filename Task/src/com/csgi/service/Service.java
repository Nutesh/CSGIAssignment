package com.csgi.service;

import java.util.List;


import com.csgi.exception.CSGIException;

/**
 * Used for declaring methods which will be implemented in Impl class
 * @author nuteshr
 *
 */
public interface Service {
	/**
	 * For Counting and returning words starting with M or m
	 * @param words
	 * @return
	 * @throws CSGIException
	 */
	public Integer wordsStartingWithM(List<String> words) throws CSGIException;
	/**
	 * For returning words with size greater than 5
	 * @param words
	 * @return
	 * @throws CSGIException
	 */
	public List<String> wordsGreaterThan5(List<String> words) throws CSGIException;
	
}
