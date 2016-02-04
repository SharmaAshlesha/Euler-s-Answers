package com.practice.euler.ques1;

public class Question2 {

	public static void main(String[] args) {
		int i, j, k = 0;
		i = 1;
		j = 2;
		int oneMillion = 4000000;
		int sum = 2;
		System.out.print(i + "  ");
		System.out.print(j + "  ");

		while (k < oneMillion) {

			System.out.print(k + "  ");
			if (k % 2 == 0) {
				sum += k;
			}
			k = i + j;
			i = j;
			j = k;
		}
		System.out.println("Question2.main()    max value" + sum);

	}

}
