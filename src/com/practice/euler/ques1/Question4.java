package com.practice.euler.ques1;

public class Question4 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 999; i > 100; i--) {
			for (int j = 999; j > 100; j--) {
				if (isPalindrome(i * j)) {
					if (result < i * j) {
						result = i * j;
					}
				}
			}
		}
		System.out.println("largest palindrome   " + result);

	}

	private static boolean isPalindrome(int i) {
		String str = i + "";
		int len = str.length();
		for (int x = 0; x < str.length() / 2; x++) {
			if (str.charAt(x) != str.charAt(len - 1 - x)) {
				return false;
			}
		}
		return true;
	}

}
