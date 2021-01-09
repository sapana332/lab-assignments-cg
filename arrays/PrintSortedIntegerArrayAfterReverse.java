package com.cg.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintSortedIntegerArrayAfterReverse {
private PrintSortedIntegerArrayAfterReverse printSortedArray_tester;
	@Test
	public void test_if_Array_is_empty() {
		int input_array[]= {};
		int result= printSortedArray_tester.getSorted(input_array);
		assertEquals(0,result);
	}
	private int getSorted(int[] input_array) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Test
	public void test_if_Array_is_single_element() {
		int input_array[]= {5};
		int result= printSortedArray_tester.getSorted(input_array);
		assertEquals(input_array[0],result);
	}
	@Test
	public void test_if_Array_is_having_same_element() {
		int input_array[]= {9,9,9,9,9,9,9,9,9};
		int test_value=input_array[7] ;
		int result= printSortedArray_tester.getSorted(input_array);
		assertEquals(test_value,result);
	}
	@Test
	public void test_if_Array_is_having_different_element() {
		int input_array[]= {9,7,6,5,4,3,2,1};
		int test_result= 12345679;
		int result= printSortedArray_tester.getSorted(input_array);
		assertEquals(test_result,result);
	}
}



