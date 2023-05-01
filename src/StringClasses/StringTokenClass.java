package StringClasses;

import java.util.*;

public class StringTokenClass {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("We Love Java Programming");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		
		String input = "We, Love, Java, Programming";
		StringTokenizer str = new StringTokenizer(input, ", ");
		System.out.println(str.countTokens());
		while(str.hasMoreElements()) {
			System.out.println(str.nextToken().trim());
		}
	}
}
