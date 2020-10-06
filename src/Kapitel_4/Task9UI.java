package Kapitel_4;

import java.util.Scanner;

public class Task9UI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Intast et bogstav: ");
        char letter = input.next().charAt(0); // tager det første tegn i inputetet
         int unicode = Task9.unicodeconverter(letter);
        System.out.println(unicode);

    }

}
