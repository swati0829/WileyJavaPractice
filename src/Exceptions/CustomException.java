package Exceptions;

class AgeNotValid extends Exception {

	public AgeNotValid(String message) {
		super(message);
	}

	@Override
	public String getMessage() {

		return "this age is not valid";
	}

	@Override
	public String toString() {

		return "age not applicable";
	}

}

public class CustomException {

	public static void getAge(int age) throws AgeNotValid {
		if (age > 18) {
			
			
			try {
				throw new AgeNotValid("Age not valid");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());

			}
		} else {
			System.out.println("Age valid");
		}
	}

	public static void main(String[] args) throws AgeNotValid {
		getAge(21);
	}
}