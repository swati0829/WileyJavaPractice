package Wiley_core_java;

abstract class Test1 {
	public abstract void m1();
	
	{
		System.out.println("Test1 Instance block");
	}
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	
	public Test1() {
		System.out.println("Test1 Constructor called");
	}
	
	public static void main(String... args) {
		System.out.println("This is the main method from abstract class");
	}
}
class Test2 extends Test1{
	
	{
		System.out.println("Test2 Instance block");
	}

	
	public void m1() {
		System.out.println("Test2 m1 method");
	}
	
	public Test2() {
		System.out.println("Test2 Constructor called");
	}
	
}
	
public class AbstractionClass {
	public static void main(String... args) {
		Test2 obj = new Test2();
		obj.m1();
		obj.m2();
		Test1.main(args);
	}
}
