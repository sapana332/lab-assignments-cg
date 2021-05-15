package com.capgemini.corejava.labassignment.arrays;

import java.util.Scanner;

public class SortAlphabetically {

	private static Scanner s1;

	public void sortString(String string1[]) {

		String temp;
		int count = string1.length;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (string1[i].compareTo(string1[j]) > 0) {
					temp = string1[i];
					string1[i] = string1[j];
					string1[j] = temp;
				}
			}
		}
		System.out.print("The sorted string is== ");
		for (int i = 0; i < string1.length; i++) {
			System.out.print(string1[i] + " ");
		}
	}

	public static void main(String[] args) {
		SortAlphabetically alphabetically = new SortAlphabetically();
		Scanner s = new Scanner(System.in);
		System.out.print("The length of string you want== ");
		int count;
		count = s.nextInt();
		String str[] = new String[count];
		s1 = new Scanner(System.in);

		System.out.println("Enter the Strings one by one:");
		for (int i = 0; i < count; i++) {
			str[i] = s1.nextLine();
		}
		alphabetically.sortString(str);
	}
}
