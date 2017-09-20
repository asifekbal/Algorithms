package com.hackerrank.algorithms.string;

import java.util.Scanner;

public class SuperReducedString {

	static String super_all_pairs(String s) {
		StringBuffer sb = new StringBuffer(s);
		for (int i = 1; i < sb.length(); i++) {
			if (sb.charAt(i) == sb.charAt(i - 1)) {
				sb.delete(i - 1, i + 1);
				i++;
			}
		}
		return sb.toString();
	}

	static String super_reduced_string(String s) {
		while (s.length() > 0) {
			int len = s.length();
			s = super_all_pairs(s);
			if (s.length() == len)
				break;
		}
		if (s.length() == 0)
			return "Empty String";
		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
		in.close();
	}
}
