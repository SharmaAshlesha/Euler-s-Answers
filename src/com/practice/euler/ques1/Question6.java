package com.practice.euler.ques1;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] str) {
		int num = 10001;
		ArrayList<Integer> primeNumbers = new ArrayList<>();
		int i = 1;
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		primeNumbers.add(7);
		while (primeNumbers.size() < num) {
			i++;
			boolean doAdd = true;
			for (int x = 0; x < primeNumbers.size(); x++) {
				if (removeMultiple(primeNumbers.get(x), i)) {
					doAdd = false;
				}
			}
			if (doAdd)
				primeNumbers.add(i);
		}

		// print all number
		for (int j = 0; j < primeNumbers.size(); j++) {
			System.out.print("   " + primeNumbers.get(j));
		}

		System.out.println(" \n size  " + primeNumbers.size());
	}

	private static boolean removeMultiple(int index, int value) {
		return value % index == 0;
	}

}
