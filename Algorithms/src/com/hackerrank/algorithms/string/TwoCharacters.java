package com.hackerrank.algorithms.string;

import java.util.Scanner;

public class TwoCharacters {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int len = scr.nextInt();
		String s = scr.next();
//		Map map = new HashMap<Integer, Integer>();
		int arr[] = new int[26];
		for (int i = 0; i < len; i++) {
			arr[s.charAt(i) - 97]++;
		}
		scr.close();

	}
}
