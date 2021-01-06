package Mandatory;
/**
 * Create a method to check if a number is a power of two or not
 * 
 */

public class CheckNoIsPowerOfTwo {

	public boolean checkNoIsPowOfTwo(int number) {
		
		while(number%2==0) {
			number = number/2;
		}
		if(number==1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		CheckNoIsPowerOfTwo checkNoIsPowerOfTwo = new CheckNoIsPowerOfTwo();
		boolean value = checkNoIsPowerOfTwo.checkNoIsPowOfTwo(54);
		if(value)
			System.out.println("The integer is Power of two");
		else
			System.out.println("The integer is not a Power of two");
	}

}


