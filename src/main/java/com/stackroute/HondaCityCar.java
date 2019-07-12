package main.java.com.stackroute;

import java.util.Scanner;

public class HondaCityCar extends Car {
    public void setGear(int gear) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the gear");
        gear = input.nextInt();
        if (gear == 1) {
            System.out.printf("The car is in gear 1");
        }
        if (gear == 2) {
            System.out.printf("The car is in gear 2");
        }
        if (gear > 5) {
            System.out.println("Invalid Gear");
        }

    }
}
