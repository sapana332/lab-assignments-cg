package Mandatory;
/**
 * Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * 
 *
 */

public class CalculateSum {
	public int calculateSumOfIntegers(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
	
		CalculateSum calculateSum = new CalculateSum();
		int value = calculateSum.calculateSumOfIntegers(5);
		System.out.println("Sum of integers divisible by 3 or 5 is " + value);
	}

}



