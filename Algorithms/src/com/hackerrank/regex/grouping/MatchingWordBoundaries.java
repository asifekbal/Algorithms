package com.hackerrank.regex.grouping;

import com.hackerrank.regex.introduction.Regex_Test;

public class MatchingWordBoundaries {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("\\b[aeiouAEIOU][A-z]*\\b");
	}
}
