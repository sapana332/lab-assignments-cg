package com.capgemini.corejava.labassignment.arrays;

import java.util.Arrays;

public class ReverseAndSort {

	public void sortArray(int array[]) {
		System.out.println("\nOriginal Array printed in reverse order:");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + "  ");
		
		int tempVariable;
		int j = array.length;
		
		for (int i = 0; i < j; i++) {
			for (int j1 = i + 1; j1 < j; j1++) {
				if (array[i] > array[j1]) {
					tempVariable = array[i];
					array[i] = array[j1];
					array[j1] = tempVariable;
				}
			}
		}
		
		System.out.println("\nThe sorted array:  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void main(String[] args) {
		
		ReverseAndSort revandSort = new ReverseAndSort();
		int arr[] = { 45, 10, 52, 9, 78, 1 };
		
		System.out.println("Original Array:  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		revandSort.sortArray(arr);
	}
}
