package Kapitel_3;

import java.util.Scanner;

public class Task17UI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2):  ");
        int choice = input.nextInt();
        System.out.println();
        System.out.println(Task17.gameRPS(choice));
    }
}
