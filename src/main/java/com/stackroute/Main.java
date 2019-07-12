package main.java.com.stackroute;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        Car car= new Car();
        car.setSpeed(100);
        car.AccelerateSpeed(5);
        car.decreaseSpeed(10);
        car.start(100);
        car.stop();

        HondaCityCar hondaCityCar= new HondaCityCar();
        hondaCityCar.setGear(1);

    }
}
