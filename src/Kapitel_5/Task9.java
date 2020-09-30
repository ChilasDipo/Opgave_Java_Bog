package Kapitel_5;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        System.out.println("how many students do you want to input");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] name = new String[n];
        int[] score= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("input name");
            String nameNOARRAY = input.nextLine();
            System.out.println("input score for elev");
            int scoreNOARRAY = input.nextInt();
            name[i] = nameNOARRAY;
            score[i] = scoreNOARRAY;
            }



//go back too it



        }
    }








/*
Test med 2 elever, 5 elever og 11
test med forkerte input

case 1
elev 1 56 , elev 2 234 , elev 3 432 , elev 4 12 , elev 5 11 ,

output : elev 4 og elev 5

 */