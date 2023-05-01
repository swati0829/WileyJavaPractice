package Exceptions;

public class ThrowClass {
	public static void m1() {
		try {
			System.out.println("Test1");
			m2();
			System.out.println("Test2");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void m2() throws InterruptedException {
		Thread t = new Thread();
		t.sleep(1000);
	}
	
	public static void main(String... args) {
		m1();
	}
}
