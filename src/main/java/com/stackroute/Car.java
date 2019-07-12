package main.java.com.stackroute;

import java.util.Scanner;

public class Car extends Vehicle {
    String number;
    String color;
    int speed;

    public Car(String brand, String price, String number, String color, int speed) {
        super(brand, price);
        this.number = number;
        this.color = color;
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
    public void applyBreak(int decrement)
    {
        speed= speed-decrement;
        System.out.println("Break applied" +speed);
    }
    public void speedUp(int increment)
    {
        speed =speed+increment;
        System.out.println("speed increased"+speed);
    }
}

