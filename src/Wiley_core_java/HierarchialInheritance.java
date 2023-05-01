package Wiley_core_java;

class Vehicle {
    public void steering() {
        System.out.println("tier");
    }
}

class Car extends Vehicle {
    public void airbag() {
        System.out.println("airbag");
    }
}

class Truck extends Vehicle {
    public void hydraulicPump() {
        System.out.println("hydraulicPump");
    }
}

public class HierarchialInheritance {
    public static void main(String... args) {
        Car car = new Car();
        car.steering();
        car.airbag();
        
        Truck sc = new Truck();
        sc.hydraulicPump();
        sc.steering();
    }
}