package main.java.com.stackroute;

import java.util.Scanner;

public class Car extends Vehicle {

        public void AccelerateSpeed(int value) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter value to increase : ");
           speed = input.nextInt();
            int speed1 = speed + value;
            if (speed1 <= 300) {
                System.out.println("the car is running at %d " +speed1);
            } else {
                System.out.println("Car is already running on maximum speed");
                speed = speed - value;
            }
        }
            public void decreaseSpeed (int value)
            {
                if (speed > 0) {
                    if (value > 0) {
                        speed = speed - value;
                        System.out.println("Car is decreasing its speed");
                    } else {
                        System.out.println("Value should be positive");
                    }
                } else {
                    System.out.println("Speed cannot be less than 0");
                }
            }

            public void stop ()
            {
                speed = 0;
                gear = 0;
                System.out.printf("\nThe car has stopped\n");
            }
            public void start (int speed)
            {
                if (speed > 0) {
                    System.out.printf("The car is already running");
                }
                else
                {
                    System.out.println("Car has to start");
                }
            }
        }

