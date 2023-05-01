package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideClass {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^(\\d+) divide by (\\d+)$"); 
		Matcher matcher = pattern.matcher("10 divide by 5");  

		if(matcher.find()) {
			String simplifiedMessage = "result = " + matcher.replaceFirst("$1/$2");
			System.out.println(simplifiedMessage);
			
			int res = Integer.valueOf(matcher.group(1)) / Integer.valueOf(matcher.group(2));
			System.out.println("Final Result = " + res);
		}
	}

}
