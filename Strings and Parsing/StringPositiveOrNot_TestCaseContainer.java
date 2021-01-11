package com.cg.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;

	import java.util.Arrays;

	public class StringPositiveOrNot_TestCaseContainer {

	/**
	         *-----------------------------------If string is Empty--------------------------------------* 
	**/	
	public static String isEmpty(String input) {
		return null;
	}
	/**
	         *-------------------If string contains only single character--------------------------------* 
	**/
	public static String checkForSingleCharacter(String input) {
		          return input;
	}	
	/**
	        *-------------------If String Contains the whitespace at any position------------------*
	**/
	public static String checkForWhitespace(String input) {
		int count=0;
		String output="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				output+="WhiteSpace Exception Caught";
				break;
	}
			else {
	          count++;			
	}
			if(count==input.length())
				output+="No Exception Caught";
	}
		   return output;
	}
	/**
	         *-------------------------If String Contains any number-------------------------------*
	**/
	public static String checkForNumber(String input) {
		String output="";
		int count=0;
		for(int i=0;i<input.length();i++) {
	     if(Character.isDigit(input.charAt(i))==true) {
	    	 output+="Number Exception Caught";
	    	 count++;
	    	 break;
	}  
	}
		if(count==0) {
			output+="No Exception Caught";		
	}
		            return output;
	}
	/**
	        *---------------------If string has character all across string-------------------------* 
	**/
	public static String checkForSimilarCharacter(String input) {
		int count=0;
		String output="";
		for(int i=1;i<input.length();i++) {
			if(input.charAt(0)==input.charAt(i)) {
				count++;
	}
	}
		    if(count==input.length()-1) {
		    output+="Same Characters in String";	
	}
		    else 
		    {
		    	output+="Characters are different";	
	}
	          return output;
	}
	/**
	       *-----------------------------------------Check for the nature of String------------------* 
	**/
	public static String stringPositiveOrNot(String input) {
		String test_string="";
		String output="";
		char input_array[]=input.toCharArray();
		Arrays.sort(input_array);
		for(int i=0;i<input_array.length;i++) {
			test_string+=input_array[i];
	}
		if(input.equals(test_string)) {
			output+="Positive String";	
	}
		else {
			output+="Negative String";
	}
		return output;
	}
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
