package Exceptions;

public class FinalBlock {

	public static void main(String[] args) {
		try {
			System.out.println("11111");
//			System.exit(0);
			System.out.println("Wiley");

			try {
				System.out.println(10/0);
			}
			catch (Exception e){
				System.out.println("Inside try block");
			}
			System.out.println("try block");
			System.out.println(10/0);
			
		} 
		catch (Exception e) {
			System.out.println("Catch block");
//			System.out.print(10/0);
//			System.exit(0);
//			e.printStackTrace();
			try {
				System.out.println("Try block inside catch block");
				System.out.println(10/0);
			}
			catch (Exception em){
				System.out.println("Inside catch block");
			}
			
			
		}
		finally {
//			System.out.print(10/0);
			System.out.println("Close connection");
		}

	}

}
