package Quickopgaver;

import java.util.Scanner;

public class IfSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("skriv et tal mellem 1 og 5     ");
        int tal = input.nextInt();
        if (tal > 0 && tal < 6) {
            switch (tal) {
                case 1:
                    System.out.println("Number is " + tal);

                    break;
                case 2:
                    System.out.println("Number is " + tal);

                    break;
                case 3:

                    System.out.println("Number is " + tal);
                    break;
                case 4:
                    System.out.println("Number is " + tal);

                    break;
                case 5:
                    System.out.println("Number is " + tal);

                    break;
            }
        }else
            System.out.println("invalid number");


    }
}
