package com.capgemini.corejava.labassignment.arrays;

public class SecondSmallestInArray {
	public int secondSmallest(int[] array) {
		int tempVariable;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					tempVariable = array[i];
					array[i] = array[j];
					array[j] = tempVariable;
				}
			}
		}
		return array[1];
	}

	public static void main(String[] args) {
		SecondSmallestInArray array = new SecondSmallestInArray();
		int[] array1 = { 23, 45, 12, 89, 6, 44 };
		int[] array2 = { 89, 78, 10, 45, 98 };
		int smallestnum1 = array.secondSmallest(array1);
		int smallestnum2 = array.secondSmallest(array2);
		System.out.println("The second smallest of array 1 is " + smallestnum1);
		System.out.println("The second smallest of array 2 is " + smallestnum2);

	}

}
