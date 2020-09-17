package Kapitel_2.Refaktorering;
import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int tal[] =tal(amount) ;
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + tal[0] + " dollars");
        System.out.println("    " + tal[1] + " quarters ");
        System.out.println("    " + tal[2] + " dimes");
        System.out.println("    " + tal[3] + " nickels");
        System.out.println("    " + tal[4] + " pennies");
    }

    public static int[] tal(double amount) {
        int remainingAmount = (int)(amount * 100);
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        int[] tal = new int[5];
        tal[0] = numberOfOneDollars;
        tal[1] = numberOfQuarters;
        tal[2] = numberOfDimes;
        tal[3] = numberOfNickels;
        tal[4] =numberOfPennies ;
            return tal ;
    }
}
