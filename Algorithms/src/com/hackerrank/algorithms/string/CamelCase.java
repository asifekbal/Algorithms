package com.hackerrank.algorithms.string;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int ctr = 1;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				ctr++;
			}
		}
		System.out.println(ctr);
		in.close();
	}
}