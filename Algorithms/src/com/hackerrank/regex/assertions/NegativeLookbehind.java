package com.hackerrank.regex.assertions;

import com.hackerrank.regex.introduction.Regex_Test;

public class NegativeLookbehind {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("o(?=oo)");
	}
}
