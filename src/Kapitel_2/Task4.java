package Kapitel_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Input størelse i meter^2  ");
        Scanner input = new Scanner(System.in);
        double meter = Double.parseDouble(input.next());
        double ping = (meter * 0.3025)  ;

        System.out.println( meter +  " meter^2 er lig " + ping + " Ping");
    }
}
