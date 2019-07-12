package main.java.com.stackroute;

public class HondaCityCar extends Car {
   String model;

    public HondaCityCar(String brand, String price, String number, String color, int speed, String model) {
        super(brand, price, number, color, speed);
        this.model = model;
    }
    public void specialFeature()
    {
        System.out.println("This car has automatic brakes facility");
    }
}
