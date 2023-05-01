package Exceptions;

import java.util.ArrayList;

class StringNotFound extends RuntimeException {
	public StringNotFound(String message) {
		super(message);
	}
}

public class Unchecked {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Venkat");
		students.add("Anjali");
		students.add("Rishav");
		
		if(!students.contains("venkata")) {
			try {
				throw new StringNotFound("This String not found");
			}
			catch(StringNotFound e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Message one");
		System.out.println("Message two");
	}

}
