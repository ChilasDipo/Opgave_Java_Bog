package Kapitel_3;

import java.util.Random;

public class Task17 {

    // public static String gameRPS(int choice, int pcchoice) { for testcase
    public static String gameRPS(int choice){
        Random ran = new Random();
       int pcchoice = ran.nextInt((2) + 1);
        //int pcchoice = 0+ran.nextInt((2-0)+1);

        if (pcchoice == choice) {
            if (pcchoice == 0 & choice == 0) {
                return "The computer is scissor. You are scissor. It is a draw";
            } else if (pcchoice == 1 & choice == 1) {
                return "The computer is rock. You are rock too. It is a draw";
            } else if (pcchoice == 2 & choice == 2) {
                return "The computer is paper. You are paper too. It is a draw";
            }
        } else if (pcchoice == 0 & choice == 1) {
            return "The computer is scissor. You are rock. You won";
        } else if (pcchoice == 0 & choice == 2) {
            return "The computer is scissor. You are paper. You lose";
        } else if (pcchoice == 1 & choice == 0) {
            return "The computer is rock. You are scissor. You lose";
        } else if (pcchoice == 1 & choice == 2) {
            return "The computer is rock. You are paper. You won";
        } else if (pcchoice == 2 & choice == 0) {
            return "The computer is paper. You are scissor. You won";
        } else if (pcchoice == 2 & choice == 1) {
            return "The computer is paper. You are rock. You lose";
        }

        return "something went wrong";
    }
}
