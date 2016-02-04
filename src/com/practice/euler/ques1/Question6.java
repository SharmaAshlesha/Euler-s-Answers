package com.practice.euler.ques1;

public class Question6 {

	/**
	 * I have calculated a formula for this question. 1^2+2^2+3^2...n^2=
	 * n(2n+1)(n+1)/6 (say A) (1+2+3+4...+n)^2 =(n(n+1)/2)^2 (say b) now I've
	 * computed a-b =n(n+1)((3n^2-n-2)/12)
	 * 
	 */
	public static void main(String args[]) {
		int n = 100;// numberToBeComputed
		int result =0;
		
		int firstPart = n*(n+1);
		int secondPart = (3*n*n)-n-2;
		int thirdPart = 12;
		result = firstPart*secondPart;
		result/=12;
		
		System.out.println("result is :  " + result);

	}

}
