package Kapitel_2.Refaktorering;
import java.util.Scanner;
public class FahreinheitToCelsius {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Indsæt en tempetur i fahrenheit: ");
            double fahrenheit = input.nextDouble();
            temp(fahrenheit);
        }
    public static void temp(double fahrenheit){
        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");

    }
}
