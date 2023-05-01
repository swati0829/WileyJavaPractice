package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
	public static void main(String[] args) {
		String input = "The key to LEARN programming is consistent practice";
		
		Pattern pattern = Pattern.compile("LEARN");
		Matcher matcher = pattern.matcher(input); //find next subsequence
		
		if(matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			
			System.out.print("Pattern found in index " + start + " " + end);
			
		}
	}
}
