package com.cg.tdddemo;


	import static org.junit.Assert.*;

	import org.junit.Test;

	public class RemoveDuplicateThenSort {
	private RemoveDuplicateThenSort_TestContainer methodtester;

	    @Test
	public void test_if_array_is_empty(){
	    int input_array[]= {};
	    int result=methodtester.isEmpty(0);
	    assertEquals(0, result);
	}
		@Test
		public void test_if_elements_more_than_two() {
		int input_array[]= {1,3,5,6,3,5,7,9,6,8,9,2,2};
		int result_array[]={9,8,7,6,5,3,2,1};
		int result[]=methodtester.removeDuplicateandSort(input_array);
		assertArrayEquals(result_array, result);
		}
		@Test
		public void test_if_single_element_is_there(){
		    int input_array[]= {1};
		    int result[]=methodtester.isSingleElementThere(input_array);
		    assertArrayEquals(input_array, result);
		}
		@Test
		public void test_elements_are_two_and_duplicate() {
		int input_array[]= {2,2};
		int result_array[]={2};
		int result[]=methodtester.ifOnlyTwoDulpicateValuesInArray(input_array);
		assertArrayEquals(result_array, result);
		}
		@Test
		public void test_elements_are_two_and_but_not_duplicate() {
		int input_array[]= {1,2};
		int result_array[]={2,1};
		int result[]=methodtester.ifOnlyTwoValuesInArrayNotDuplicate(input_array);
		assertArrayEquals(result_array, result);
		}

	}


