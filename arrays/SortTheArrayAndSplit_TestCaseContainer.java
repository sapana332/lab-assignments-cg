package com.cg.tdddemo;
import java.util.Arrays;

public class SortTheArrayAndSplit_TestCaseContainer {
/**-------If Array of String is Empty------------------------**/	
public static int isEmpty(int array_length) {
		      return 0;
}

/**---------------If there is only one element in array--------------------**/
public static String ifSingleElementIsThere(String array_value[]) {
		      return array_value[0].toUpperCase();
}

/**---------------If the Array length is Odd----------------------------------**/
public static String split_odd(String input[]) {
	          Arrays.sort(input);
		      String odd_String="";
		      for(int i=0;i<(input.length/2)+1;i++) {
			  odd_String+=input[i].toUpperCase()+" ";
}
		      for(int j=(input.length/2)+1;j<input.length;j++) {
		    	  if(j==input.length-1) {
		    		odd_String+=input[j].toLowerCase();		  
}
		    	  else {
			       odd_String+=input[j].toLowerCase()+" ";
}
}
		      return odd_String;
}

/**------------------If the array length is even---------------------------------**/
public static String split_even(String input[]) {
	    Arrays.sort(input);
		String even_String ="";
		for(int i=0;i<(input.length/2);i++) {
			even_String+=input[i].toUpperCase()+" ";
}
		for(int j=(input.length/2);j<input.length;j++) {
			 if(j==input.length-1) {
				 even_String+=input[j].toLowerCase();		  
}
		    	  else {
		    		  even_String+=input[j].toLowerCase()+" ";
}
		
}
		    return even_String;
}

/**----------------Main functional method where all the above functions are used---------**/
public static String sortTheArrayAndSplit_TestCaseContainer(String input[]) {
	String output="";
	if(input.length==1) {
		output+=ifSingleElementIsThere(input);
}
	if(input.length%2==0) {
		output+=split_even(input);
}
		if(input.length%2==1 && input.length>1) {
			output+=split_odd(input);
}
	 return output;
}
   
}






