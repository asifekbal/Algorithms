package com.hackerrank.regex.introduction;

public class MatchingDigitsAndNonDigitCharacters {
	public static void main(String[] args) {

		Regex_Test tester = new Regex_Test();
		tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d");
	}
}