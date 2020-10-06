package Quickopgaver;

import java.util.Scanner;

public class Mathfun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double input12 = input.nextDouble();
        double input23 = input.nextDouble();
        double input1  = Math.floor(input12);
        double input2 = Math.ceil(input23);

        double rinf = Math.rint(input12);
        double pow = Math.pow(input1,input2);
        double sqrt = Math.sqrt(input1);
        double log = Math.log(input1);
        double log10 = Math.log10(input1);
        double exp = Math.exp(input1);

        System.out.println("pow = " + pow );
        System.out.println("sqrt = " + sqrt);
        System.out.println("log of first input " + log);
        System.out.println("log10 of first input " + log10);
        System.out.println("exp of first input " + exp);
        System.out.println("rinf of first input " + rinf);




       /* for (int i = 0; i <101 ; i++) {
            int rnd1 = rnd.Next(1,100);
            System.out.println(rnd1);
        } */

    }
}
