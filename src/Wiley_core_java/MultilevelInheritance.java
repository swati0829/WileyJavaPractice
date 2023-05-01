package Wiley_core_java;

class Vehicle1 {
    public void tier() {
        System.out.println("tier");
    }
    public void steering() {
        System.out.println("tier");
    }
}

class Car1 extends Vehicle1 {
    public void airbag() {
        System.out.println("airbag");
    }
}

class SmartCar extends Car1 {
    public void sensor() {
        System.out.println("sensor");
    }
}

public class MultilevelInheritance {
    public static void main(String... args) {
        SmartCar sc = new SmartCar();
        sc.sensor();
        sc.airbag();
        sc.steering();
    }
}