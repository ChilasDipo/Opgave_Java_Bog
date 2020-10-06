package Kapitel_4;

import java.util.Scanner;

public class Task17UI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Intast et årstal: ");
        int year = input.nextInt();
        System.out.println();
        System.out.print("Intast de første tre bogstaver i et månded med stort først: ");
        String month = input.next();
        System.out.println(Task17.mounthandday(year,month));
    }
}
