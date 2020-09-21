package Kapitel_2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Input længde i miles ");
        Scanner input = new Scanner(System.in);
        double miles = Integer.parseInt(input.next());
        double KM = miles * 1.6 ;
        System.out.println("Længden i Kilometer er " + KM);
    }
    public static double test(double miles) {
        return miles * 1.6 ;
    }
}