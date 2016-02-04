package com.practice.euler.ques1;

import java.util.ArrayList;

public class Question10 {

	public static void main(String args[]) {

		int num = 2000000;

		ArrayList<Integer> primeNumbers = new ArrayList<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		primeNumbers.add(7);

		int sum = 0;
		int i = 1;
		while (i <= num) {
			i+=2;  // Increment by 2 as all prime are odd 
			boolean doAdd = true;
			for (int x = 0; x < primeNumbers.size(); x++) {
				if (removeMultiple(primeNumbers.get(x), i)) {
					doAdd = false;
				}
			}
			if (doAdd) {
				primeNumbers.add(i);
			}
		}
		
		for (int j = 0; j < primeNumbers.size(); j++) {
			sum+=primeNumbers.get(j);
		}
		

		System.out.println("sum of all prime number below " + num + "  : " + sum);

	}

	private static boolean removeMultiple(int index, int value) {
		return value % index == 0;
	}

}
