package Mandatory;
/**
 * Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 * 
 *
 */

public class CalculateDifference {
	public int calculateDiffOfSum(int number) {
		int sumOfIntegers = 0, sumOfSquaresOfInt = 0;
		for(int i=1;i<=number;i++) {
			int squares;
			sumOfIntegers = sumOfIntegers + i;
			squares = i*i;
			sumOfSquaresOfInt = sumOfSquaresOfInt + squares;
		}
		int sum = sumOfSquaresOfInt - (sumOfIntegers*sumOfIntegers);
		return sum;
	}
	public static void main(String[] args) {
		CalculateDifference calculateDifference = new CalculateDifference();
		System.out.println("Result is " +calculateDifference.calculateDiffOfSum(4));

	}

}

	


