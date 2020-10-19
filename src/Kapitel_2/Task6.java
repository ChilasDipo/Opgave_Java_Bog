package Kapitel_2;
//reeeeeeeeeeee - ravn
//reeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee you back
// baka - Gustav
//
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Input a number between 0 and 1000 ");
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.next());

        if (number > 0 & number < 1000 ) {
            if (number < 10 ) {
                System.out.print(number);
                System.exit(0);
            }else if (number >= 10 & number < 100){
                int digit1 =  number % 10 ;
                int nynumber = number / 10;
                int digit2 =  nynumber % 10 ;
                System.out.print(digit1 * digit2);
                System.exit(0);
            }else if (number >= 100 & number < 1000){
                int digit1 =  number % 10 ;
                int nynumber = number / 10;
                int digit2 =  nynumber % 10 ;
                int nynumber2 = nynumber / 10;
                int digit3 =  nynumber2 % 10 ;
                System.out.print(digit1 * digit2 * digit3);
                System.exit(0);
            }
        }else System.out.print("too smool or too GRANDE");
        System.exit(0);






    }
}
