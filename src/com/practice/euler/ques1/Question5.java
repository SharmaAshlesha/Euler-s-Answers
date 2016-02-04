package com.practice.euler.ques1;

public class Question5 {
	public static void main(String args[]) {
		long result = 1;
		for (long i = 2; i <= 20; i++) {
			result = FindFactor(result, i);
		}
		System.out.println("result is : " + result);
	}

	static long FindFactor(long result, long index) {
		long finalValue, commonFactor = 0;
		long i = 1;
		long maxValue = result > index ? result : index;
		while (i < maxValue) {
			if ((result % i == 0) && (index % i == 0))
				commonFactor = i;
			i++;
		}
		finalValue = (result * index) / commonFactor;
		return finalValue;
	}
}
