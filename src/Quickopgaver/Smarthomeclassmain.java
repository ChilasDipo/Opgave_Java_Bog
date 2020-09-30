package Quickopgaver;

import java.util.Scanner;

public class Smarthomeclassmain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input værdi for data drei ting");
        double temp = input.nextDouble();
        double hum = input.nextDouble();
        double dust = input.nextDouble();
        boolean door = true; //aktivt valgt dumt navn :D

        Smarthomeclass data = new Smarthomeclass(temp,hum,dust,door);


        if (!data.openwindow){
            if (data.visibility>0.50) {
                System.out.println("window needs to be opened over 50 procent less visibility (dust in air)");
            }
            if (data.huminity<0.25 | data.huminity > 0.65) {
                System.out.println("alt for meget fugt open dat window");
            }
        }else System.out.println("that window is open");






    }
}
