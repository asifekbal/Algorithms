package com.hackerrank.regex.assertions;

import com.hackerrank.regex.introduction.Regex_Test;

public class PositiveLookbehind {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("(?<=[13579])\\d"); 
	}
}
