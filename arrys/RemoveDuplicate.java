package com.capgemini.corejava.labassignment.arrays;

public class RemoveDuplicate {
	public int removeDuplicateElements(int arr[], int n) {
		
		
		int[] temp = new int[n];
		int j = 0;
		
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public void sortArray(int arr[]) {
		int l = arr.length;
		int len = removeDuplicateElements(arr, l);
		int tempVariable;
		
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] < arr[j]) {
					tempVariable = arr[i];
					arr[i] = arr[j];
					arr[j] = tempVariable;
				}
			}
		}
		System.out.println("\nThe sorted array is  :  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		RemoveDuplicate duplicate = new RemoveDuplicate();
		int arr[] = { 12, 45, 12, 2, 78 };
		int length = arr.length;
		
		System.out.println("The original array is:  ");
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
		
		length = duplicate.removeDuplicateElements(arr, length);
		
		System.out.println("\nThe modified array is:  ");
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
		duplicate.sortArray(arr);
	}

}
