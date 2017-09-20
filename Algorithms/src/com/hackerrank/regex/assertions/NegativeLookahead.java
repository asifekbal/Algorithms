package com.hackerrank.regex.assertions;

import com.hackerrank.regex.introduction.Regex_Test;

public class NegativeLookahead {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("(?<![aeiouAEIOU]).");
	}
}
