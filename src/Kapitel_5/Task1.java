package Kapitel_5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while(true){
            //a infinite loop so den fortsætter indtil at koden bliver stoppet af break
            System.out.println("input javascore end program with -1");
            Scanner input = new Scanner(System.in);
            int javascore = input.nextInt();
            if (javascore == -1) {
                System.out.println("no numbers are entered except 0");
                break;
            } else if (javascore < 60) {
                System.out.println("You don't pass the exam");
            } else if (javascore >= 60) {
                System.out.println("you pass the test");
            }
        }
    }
}
 /*
 case 1
 input 61
 forventer output = sout you pass the test program runs again

 case 2
 input -1
 forventer output = sout no number loop stops

 case 3
 input 20
 forventer output = you dont pass program runs again

 case 4
 input 60
 forventer output = sout you pass the test program runs again
  */