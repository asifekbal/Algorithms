package com.hackerrank.regex.introduction;

public class MatchingWordAndNonWordCharacter {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("\\w\\w\\w\\W\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\W\\w\\w\\w"); 
	}
}
