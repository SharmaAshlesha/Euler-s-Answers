package com.practice.euler.ques1;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long num = 600851475143l;

		ArrayList<Long> primeFactors = getPrimeFactors(num);

		if (primeFactors == null) {
			System.out.println("This number doesn't have any prime factor.");
			return;
		}
		if (primeFactors.size() == 0) {
			System.out.println("This number doesn't have any prime factor.");
			return;
		}
		long maxValue = primeFactors.get(0);
		for (int i = 0; i < primeFactors.size(); i++) {
			if (primeFactors.get(i) > maxValue) {
				maxValue = primeFactors.get(i);
			}
		}

		System.out.println("max prime factor of " + num + ": is " + maxValue);
		System.out.println("solved in : "+ ((System.currentTimeMillis()-startTime)/1000));
	}

	private static ArrayList<Long> getPrimeFactors(long num) {
		ArrayList<Long> array = new ArrayList<>();
		long size = (long) Math.sqrt(num);
		for (long i = 1; i <= size; i+=2) {
			if (isPrime(i) && num % i == 0) {
				array.add(i);
				System.out.println("Question3.getPrimeFactors()  "+ i);
			}
		}
		return array;
	}

	private static boolean isPrime(long num) {
		long size = num / 2;
		for (long i = 2; i <= size; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
