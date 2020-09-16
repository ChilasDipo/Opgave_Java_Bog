package Kapitel_2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Antal minuter ");



        Scanner input = new Scanner(System.in);
        String mins = input.nextLine();

        double mini = Integer.parseInt(mins);
        double mind = Double.parseDouble(mins);

        double ar = Math.round( (mind / 525960.0) * 100.0 ) / 100.0 ;
        // rounder min beregning ned til 2 deciamler ved Math.round
        int x = (int)ar;
        // laver min double om til en int så der ikke er nogle decimaller på mine år
        System.out.println( x + " år");
        double digit = (ar * 100) % 100;
        double dage = (365/100) * digit;
        //System.out.println(digit);


      System.out.println(dage + " dage");
    }
}
