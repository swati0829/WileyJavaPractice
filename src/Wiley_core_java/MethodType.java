package Wiley_core_java;

class test{
	public static int add(int v1, int v2) {
		int val = v1 + v2;
		return val;
	}
}

public class MethodType {
	
	public void sub(int v1, int v2) {
		int val = v1 - v2;
		System.out.println("Substanction instance method:- " + val);
	}
	
	public void add(int v1, int v2) {
		int val = v1 + v2;
		System.out.println("Addition in instance method:- " + val);
		
		this.sub(9,5);
	}
	
	public static int mul(int v1, int v2) {
		int val = v1 * v2;
		return val;
	}

	public static void main(String[] args) {
		
		int m = mul(26, 36);
		
		System.out.println(m);
		
		MethodType mt = new MethodType();
		
		mt.add(25, 27);
		System.out.println("from test class " + test.add(2,3));
		
	}
}