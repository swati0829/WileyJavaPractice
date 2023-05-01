package Wiley_core_java;


class A {
    public void a() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void b() {
    	System.out.println("Class B");
    }
}

class C extends A {
    public void c() {
    	System.out.println("Class C");
    }
}

class D extends B {
	public void d() {
		System.out.println("Class D");
	}
}

class E extends D {
	public void e() {
		System.out.println("Class E");
	}
}


class HybridInheritance {

	public HybridInheritance() {
		 E obj_e = new E();
	     obj_e.a();
	     obj_e.b();
	     obj_e.d();
	     obj_e.e();
	        
	     C obj_c = new C();
	     obj_c.a();
	     obj_c.c();
	}

}
