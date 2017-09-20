package com.hackerrank.regex.character;

import com.hackerrank.regex.introduction.Regex_Test;

public class ExcludingSpecificCharacters {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		 tester.checker("^[^0-9][^aeiou][^bcDF][\\S][^AEIOU][^.,]$"); 
	}
}
