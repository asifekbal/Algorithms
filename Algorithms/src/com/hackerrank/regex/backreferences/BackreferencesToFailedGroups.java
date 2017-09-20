package com.hackerrank.regex.backreferences;

import com.hackerrank.regex.introduction.Regex_Test;

public class BackreferencesToFailedGroups {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		tester.checker("^\\d\\d(-?)(\\d\\d\\1){2}\\d\\d$");
	}
}
