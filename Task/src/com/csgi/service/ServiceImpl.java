package com.csgi.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import com.csgi.exception.CSGIException;

/**
 * Used for Defining Service Logic/Rules
 * @author nuteshr
 *
 */
public class ServiceImpl implements Service {
	/**
	 * Taking list of words as input and returning count of words
	 * starting with m or M
	 */
	@Override
	public Integer wordsStartingWithM(List<String> words) throws CSGIException {
		Integer count=0;
		for(String word:words) {
			if(word.charAt(0)=='m' || word.charAt(0)=='M' )
				count++;
		}
		return count;
	}

	/**
	 * Taking list of words as input and returning all words greater than 5
	 */
	@Override
	public ArrayList<String> wordsGreaterThan5(List<String> words) throws CSGIException {
		ArrayList<String> wordsGreaterThan5 = new ArrayList<>();
		for(String word:words) {
			if(word.length() > 5)
				wordsGreaterThan5.add(word);
		}
		return wordsGreaterThan5;
	}

	
}
