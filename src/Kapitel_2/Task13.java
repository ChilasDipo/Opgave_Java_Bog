package Kapitel_2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.print("Input måndelig opsparing ");
        Scanner input = new Scanner(System.in);
        double saving = Integer.parseInt(input.next());

        final double rante = 0.003125;
        double nysaving1 = saving;

        for (int i = 0; i < 6; i++) {
            //integer = 0 ; indtil 1 er 5 ; i tæller op med 1, tæller fra 0 til 5, 6 månderer
            double savingman = (nysaving1 * rante) + nysaving1;
            System.out.println(savingman);
            nysaving1 = savingman + saving;
        }


    }
}
