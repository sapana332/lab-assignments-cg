package com.cg.tdddemo;

	import static org.junit.Assert.*;

	import org.junit.Test;
	/**
	   *------------------------Program to print the integers of array along with the sum---------------------------*
	**/
	public class PrintIntegerValueWithSum_Main {
	private PrintIntegerValueWithSum_TestContainer tester_method;

	   @Test
	   public void if_Array_Is_Empty() {
	    int input[]= {};
	    String result=tester_method.mainTesterMethod(input);
	    assertEquals("0",result); 
	}

	   @Test
	   public void if_Single_Element_In_Array() {
	    int input[]= {2};
	    String output="Element and Sum is: "+input[0];
	    String result=tester_method.mainTesterMethod(input);
	    assertEquals(output,result); 
	}    

	    @Test
	    public void if_Two_Elements_Are_In_Array() {
		    int input[]= {2,2};
		    String output="Elements are 22 & Sum is: 4";
		    String result=tester_method.mainTesterMethod(input);
		    assertEquals(output,result); 
	    }
	    @Test
		public void if_Elements_Are_Same_In_Array() {
			int input[]= {2,2,2,2,2};
			String output="Elements are 22222 & Sum is: 10";
			String result=tester_method.mainTesterMethod(input);
			assertEquals(output,result);
		}
		@Test
		public void if_Elements_Are_Different_In_Array() {
			int input[]= {1,2,3,4,5,6,7};
			String output="Elements are 1234567 & Sum is: 28";
			String result=tester_method.mainTesterMethod(input);
			assertEquals(output,result);
		}

	}


