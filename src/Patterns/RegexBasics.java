package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {

	public static void main(String[] args) {
		
//		String re = "..";
//		String re = "\\w\\w\\w"; //(a-z, A-Z, 0-9, _) W for special character 
//		String re = "\\w\\s"; //s - one empty space , \\w\\s means one character continues with space
//		String re = "\\S\\s\\W"; //S contains non white space characters 
		
		String re = "\\d\\D"; //d -> matching digits 
		String text = "9@";
		
		Pattern pattern = Pattern.compile(re);
		Matcher mt = pattern.matcher(text);
		
		System.out.println(mt.matches()); //matches finds exact pattern

	}

}
