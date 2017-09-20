package com.hackerrank.regex.repetition;

import com.hackerrank.regex.introduction.Regex_Test;

public class MatchingCustomRepetitions {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^[\\d]{1,2}[a-zA-Z]{3,}[.]{0,3}$"); 
	}
}
