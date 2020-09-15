package Kapitel_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Input længde og højde af trekanten ");
        Scanner input = new Scanner(System.in);
        double sidelængde = Double.parseDouble(input.next());
        double areal = (Math.sqrt(3) /4) * Math.pow(sidelængde,2)  ;
        double volume = areal * sidelængde;
        System.out.println("Volumen af trekanten er " + volume);
    }
}
