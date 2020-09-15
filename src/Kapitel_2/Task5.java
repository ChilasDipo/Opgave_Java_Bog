package Kapitel_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Input a subtotal and a gratutity rate ");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        double subtotal = Double.parseDouble(input.next());
        double gratutity = Double.parseDouble(input.next());
        double procent = (subtotal/100.0) * gratutity;
        System.out.println(procent);
        double nytotal = (subtotal + procent);
        System.out.println(nytotal);
    }
}
