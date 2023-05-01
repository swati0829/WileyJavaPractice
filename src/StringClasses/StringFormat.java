package StringClasses;

import java.util.*;

public class StringFormat {

	public static void main(String[] args) {
		String title = "Java Developer";
		float salary = 2000.3999f;
		System.out.format("%s has %.3f UDS salary\n", title, salary);
		
		
		List<String> techStack = Arrays.asList(
				
				"Essential Java", "Head First into Java","Java Design Patterns"
				);
		
		for(String book: techStack) {
			System.out.format("%-30s - In Stock \n", book); //-30 justification from the left
		}
	}

}
