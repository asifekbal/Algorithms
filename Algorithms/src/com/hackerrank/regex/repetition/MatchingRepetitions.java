package com.hackerrank.regex.repetition;

import com.hackerrank.regex.introduction.Regex_Test;

public class MatchingRepetitions {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^[a-zA-Z02468]{40}[13579\\s]{5}$");
	}
}
