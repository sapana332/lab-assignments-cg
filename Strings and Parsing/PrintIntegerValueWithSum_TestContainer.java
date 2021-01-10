package com.cg.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;

	public class PrintIntegerValueWithSum_TestContainer {
		public static int count=0;


		/**
		             *------------------If Array is Empty----------------* 
		**/
		public static String ifArrayIsEmpty(int input[]){
			return "0";
		}
		/**
		             *---------If There is one element in Array------------* 
		**/
		public static String ifSingleElementInArray(int input[]){
			return "Element and Sum is: "+String.valueOf(input[0]);
		}
		/**
		             *--------If only two elements are in array-----------------* 
		**/
		public static String ifTwoElementsAreInArray(int input[]){
			return "Elements are "+input[0]+""+input[1]+" & Sum is: "+String.valueOf(Integer.sum(input[0],input[1]));
		}
		/**
		              *------------------If elements are same entire array-------------* 
		**/
		public static String ifElementsAreSameInArray(int input[]){
		String input_value="";
				for(int i=0;i<input.length;i++) {
					if(input[0]==input[i]) {
					input_value+=input[i];
					count++;
		}
		}
				   if(count==input.length-1) {
				   int sum=input[0]*input.length;
				   input_value="Elements are "+input_value+" & Sum is: "+String.valueOf(sum);
		}
			       return input_value;
		}
		/**
		           *---------------------If all elements are more than 2 and different---------------------*
		**/
		public static String ifElementsAreDifferentInArray(int input[]){
		String input_value="";
		int sum=0;
				 for(int i=0;i<input.length;i++) {
				 input_value+=String.valueOf(input[i]);
				 sum+=input[i];
		}
				return "Elements are "+input_value+" & Sum is: "+String.valueOf(sum);
		}
		/**
		                *------------------Main Tester Method------------------------------* 
		**/
		public static String mainTesterMethod(int input[]) {
		String tester_output="";
			    if(input.length==0){
				tester_output+=ifArrayIsEmpty(input);
		}
			   else
				if(input.length==1) {
					tester_output+=ifSingleElementInArray(input);
		}
			   else
				if(input.length==2) {
					tester_output+=ifTwoElementsAreInArray(input);
		}
			    if(count==input.length-1 & input.length>2) {
				   tester_output+=ifElementsAreSameInArray(input);
		}
			   else 
				   if(input.length>2){
				   tester_output+=ifElementsAreDifferentInArray(input);
		}
			       return tester_output;
		}
		



	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
