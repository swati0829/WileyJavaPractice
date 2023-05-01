package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("agent \\d\\d\\d");
//		Pattern pattern = Pattern.compile("agent \\d{3}"); //atleast 3
//		Pattern pattern = Pattern.compile("agent \\d{3,}"); //atleast 3 id digit and next can be anything
		Pattern pattern = Pattern.compile("agent \\d{3,4}"); //min 3 max - 4
		Matcher matcher = pattern.matcher("agent 00000");  
		
		boolean found = matcher.find();
		boolean match = matcher.matches();
		
		System.out.println("Found : " + found);
		System.out.println("Match : " + match);
	}

}
