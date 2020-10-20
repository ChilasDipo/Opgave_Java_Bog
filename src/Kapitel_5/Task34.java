package Kapitel_5;

import Kapitel_3.Task17;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean won = false;
        int pcwins = 0 ;
        int yourwins = 0;

        while(won==false) {
            System.out.print("scissor (0), rock (1), paper (2):  ");
            int choice = input.nextInt();
          // int choice = 2;
            String winner = Task17.gameRPS(choice);
            System.out.println(Task17.gameRPS(choice));

            if (winner.contains("You won")) {
                yourwins ++;
            }else if (winner.contains("You lose")){
                pcwins ++;
            }
            if (pcwins == (yourwins + 3 )| (yourwins == pcwins +3)){
                if (pcwins > yourwins){
                    System.out.println("pc won too much");
                }else if(yourwins > pcwins){
                    System.out.println("you won too much");
                }
                break;

            }
        }
        System.out.println("game stoped");
    }
}