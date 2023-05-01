package Exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("First Statement");
		
		int arr[] = {1,2,3,4};
		
		try {
			System.out.println(arr[1]);
			System.out.println(arr[3]);
			
			System.out.println("Simple Statement");
			
			String str = "Venkat";
			System.out.println(str.charAt(0));
			
			System.out.println(12/0);


			System.out.println("Simple Statement");

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Catch Block 2");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Catch Block 3");
			e.printStackTrace();
		}
		
		System.out.println("Another Statement");
	}

}
