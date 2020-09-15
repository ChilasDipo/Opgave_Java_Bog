package Kapitel_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Input længde i meter  ");
        Scanner input = new Scanner(System.in);
        double meter = Double.parseDouble(input.next());
        double feet = (meter * 3.2786)  ;

        System.out.println( meter +  " meter er lig " + feet);
    }
}
