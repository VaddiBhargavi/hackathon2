package main.java.com.stackroute;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    HondaCityCar hondaCityCar= new HondaCityCar("ALTO","100000","123","red",200,"111");
    hondaCityCar.speedUp(50);
    hondaCityCar.applyBreak(30);
    hondaCityCar.specialFeature();
        System.out.println(hondaCityCar);

    }
}
