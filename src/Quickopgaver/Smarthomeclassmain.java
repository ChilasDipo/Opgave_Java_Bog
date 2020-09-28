package Quickopgaver;

import java.util.Scanner;

public class Smarthomeclassmain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input værdi for data drei ting");
        double temp = input.nextDouble();
        double hum = input.nextDouble();
        double dust = input.nextDouble();

        Smarthomeclass data = new Smarthomeclass(dust);


        if (dust>0.50) {
            System.out.println("window needs to be opened over 50 procent less visibility (ust in air)");
        }


    }
}
