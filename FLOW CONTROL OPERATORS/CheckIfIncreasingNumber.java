package Mandatory;
/**
 * Create a method to check if a number is an increasing number
 * @param args
 */

public class CheckIfIncreasingNumber {
	public boolean checkNumber(int number) {

		boolean flag = false;
		int currentDigit = number % 10;
		number = number / 10;
		while (number > 0) {
			if (currentDigit <= number % 10) {
				flag = true;
				break;
			}
			currentDigit = number % 10;
			number = number / 10;
		}
		if (flag)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		CheckIfIncreasingNumber checkIfIncreasingNumber = new CheckIfIncreasingNumber();
		boolean value = checkIfIncreasingNumber.checkNumber(123);
		if (value)
			System.out.println("It is not an increasing number");
		else
			System.out.println("It is an increasing number");

	}

}


