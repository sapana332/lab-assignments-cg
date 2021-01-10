package labassignment3;

	/*  Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
	*  The digit in the units place can be left as it is.
	*/
	
	
	import java.util.*;
	public class Exercise4 {
		public static void main(String[] args) {
			int number = getInputNumber();
			System.out.println("Modified Number ----> "+modifyNumber(number));	
		}
		private static int modifyNumber(int number) {
			String str =Integer.toString(number);
			StringBuffer  modifiedString = new StringBuffer();
			int length = str.length(),modifiedNumber=0;
			for(int index=0;index<length-1;index++) {
				 modifiedString.append(Math.abs(Character.getNumericValue(str.charAt(index+1))-Character.getNumericValue(str.charAt(index))));
			}
			modifiedString.append(str.charAt(length-1));
			modifiedNumber=Integer.parseInt(modifiedString.toString());
			return modifiedNumber;
		}
		private static int getInputNumber() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			int number = sc.nextInt();
			return number;
		}


	}


