package com.cg.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintSecondLargestElement_TestContainer {
	private PrintSecondLargestElement secondLargestValue;
	@Test
	public void test_for_zero_length_array() {
				int newNumbers[]= {};
				int result=secondLargestValue. calculateSecondLargestElement(newNumbers);
				assertEquals(0,result);

	}
	@Test
	public void test_for_single_length_array() {
				int newNumbers[]= {1};
				int result=secondLargestValue. calculateSecondLargestElement(newNumbers);
				assertEquals(1,result);

	}
	@Test
	public void test_for_double_length_array() {
				int newNumbers[]= {1,2};
				int result=secondLargestValue. calculateSecondLargestElement(newNumbers);
				assertEquals(1,result);

	}
	@Test
	public void test_for_more_than_two_elements_in_array() {
		int newNumbers[]= {1,2,4,6,8,9,0,6,9,5};
		int result=secondLargestValue. calculateSecondLargestElement(newNumbers);
		assertEquals(9,result);
	}



	
	}


