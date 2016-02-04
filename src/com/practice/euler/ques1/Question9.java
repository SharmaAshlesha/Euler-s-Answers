package com.practice.euler.ques1;

public class Question9 {

	public static void main(String[] args) {

		for (int c = 0; c < 500; c++) {
			for (int b = 0; b < 500; b++) {
				for (int a = 0; a < 300; a++) {
					if (a + b + c == 1000 && (a * a + b * b == c * c)) {
						System.out.println((a * b * c));
						return;
					}

				}
			}
		}

	}

}
