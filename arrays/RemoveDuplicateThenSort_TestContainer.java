package com.cg.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;


import java.util.Arrays;

public class RemoveDuplicateThenSort_TestContainer {
/**-----------------------If Array is Empty----------------------------**/
public static int isEmpty(int Array_length) {
		return 0;
}
/**-------------------------If Array is having one element only---------------**/

public static int[] isSingleElementThere(int Array_Value[]) {
	return Array_Value;
}
/**---------------------If Array having the same element all across array---------------------------**/
public static int[] ifSameElementAllAcrossArray(int input_Array[]) {
	int count=0;
	int same_value_container[] = {};
	for(int i=1;i<input_Array.length;i++) {
    		if(input_Array[0]==input_Array[i]) {
    			count++;
}
}
	if(count==input_Array.length-1) {
		same_value_container[0]=input_Array[0];
}
	return same_value_container;
}
/**------------------------If Array having only two elements but duplicate------------------------------------**/
public static int[] ifOnlyTwoDulpicateValuesInArray(int input_Array[]) {
	 int single_value_container[]= new int[1];
	 if(input_Array[0]==input_Array[1]) {
		 single_value_container[0]=input_Array[0];
}    
	     return single_value_container; 
}
/**------------------------If Array having only two elements but not duplicate------------------------------------**/
public static int[] ifOnlyTwoValuesInArrayNotDuplicate(int input_Array[]) {
	 int double_value_container[]=new int[2];
		 Arrays.sort(input_Array);
		 double_value_container[0]= input_Array[1];
		 double_value_container[1]= input_Array[0];
	     return double_value_container; 
}
/**------------------------Method to Remove Duplicate elements-------------------------**/
public static int[] removeDuplicateandSort(int input[]) {
	Arrays.sort(input);
	String unique_integer_container="";
	int j=0;
	int count=0;
	for(int i=0;i<input.length;i++){
		for(int k=i+1;k<input.length;k++) {
		if(input[i]==input[k]){
			count++;  
}
}
		if(count==0) {
			unique_integer_container+=input[i];  
			  j++;
}
		count=0;
}
       int n=Integer.parseInt(unique_integer_container);
       int modify_Array[]=new int[j];
       for(int i=0;i<j;i++) {
	   modify_Array[i]=n%10;
	   n=n/10;
}
	   return modify_Array;
}


	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
