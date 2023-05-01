package Wiley_core_java;

class Employee {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}

class Employee1 {
	public void show(Employee emp) {
		System.out.println("Calling show method");
		System.out.println("Name : " + emp.getName() + " age : " + emp.getAge());
	}

}
public class EmployeeEncapsulation {
	public static void maine(String... args) {
		Employee emp = new Employee();
		emp.setName("Wiley");
		emp.setAge(15);
		
		Employee1 eimpl = new Employee1();
		eimpl.show(emp);
	}
}
