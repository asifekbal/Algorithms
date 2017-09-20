package com.hackerrank.regex.backreferences;

import com.hackerrank.regex.introduction.Regex_Test;

public class MatchingSameTextAgainAgain {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^([a-z]\\w\\s\\W\\d\\D[A-Z][A-zA-Z][aeiouAEIOU]\\S)\\1$"); 
	}
}
