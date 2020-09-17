package Kapitel_2.Refaktorering;
import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int sekunder = input.nextInt();
        tid(sekunder);


    }

    public static void tid(int sekunder){
        int minuter = sekunder / 60; // Find minutes in seconds
        int restSekunder = sekunder % 60; // Seconds remaining
        System.out.println(sekunder + " sekunder er " + minuter +
                " minuter og " + restSekunder + " sekunder");
    }
}
