package com.cg.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class PrintSortedIntegerArrayAfterReverse_TestContainer {

/**------------------------------If Array is Empty--------------------------**/

public static int isEmpty(int Array_length) {
		return 0;
}
/**-------------------------If Array is having one element only---------------**/

public static int isSingleElementThere(int Array_Value) {
	return Array_Value;
}
/**---------------------If Array having the same element all across array---------------------------**/
public static int ifSameElementAllAcrossArray(int input_Array[]) {
	int count=0;
	int same_value_container = 0;
	for(int i=1;i<input_Array.length;i++) {
    		if(input_Array[0]==input_Array[i]) {
    			count++;
}
}
	if(count==input_Array.length-1) {
		same_value_container=input_Array[0];
	}
	return same_value_container;
}
/**----------------------------------If Array elements are different------------------------**/
public static int ifDifferentElement(int input[]) {
	int input_op[]=new int[input.length];
	String input_string="";
	int j=0;
	for(int i=input.length-1;i>=0;i--){
		input_op[j]+=input[i];
		j++;
}
	Arrays.sort(input_op);
	for(int i=0;i<input_op.length;i++) {
		input_string+=input_op[i];
}
    int sorted_result=Integer.parseInt(input_string);
     return sorted_result;
}
/**--------------------------------------Required-Method-------------------------------------**/
public static int getSorted(int input_array[]) {
	int result=0;
	if(input_array.length==0) {
		result=isEmpty(input_array.length);
}
	else 
		if(input_array.length==1) {
			result=isSingleElementThere(input_array[0]);
}
	else
		if(input_array.length>1 && input_array[0]==input_array[1] && input_array[1]==input_array[input_array.length-1]) {
			result=ifSameElementAllAcrossArray(input_array);
			
}
	else {
		result=ifDifferentElement(input_array);
}
	return result;
}
      


	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
