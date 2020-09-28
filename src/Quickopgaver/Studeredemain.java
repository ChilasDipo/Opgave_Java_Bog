package Quickopgaver;

import java.util.Scanner;

public class Studeredemain {
    public static void main(String[] args) {
        Studerende st1 = new Studerende("Lasse",22,"Skuerløse");
        Studerende st2 = new Studerende("Gustav", 24, "Haslev");
        Studerende st3 = new Studerende("Andreas", 23,"Næstved");
        Studerende st4 = new Studerende();
        Studerende st5 = new Studerende("Someone",45);
        st4.by = "skuerløse";
        System.out.println("Studerede oprettede");
        System.out.println("-----------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Navn på den alder du ønsker at kende");
        String name = input.next();
        switch (name){
            case "Lasse":
                System.out.println(st1.navn+ " alder er  " + st1.alder);
                break;
            case "Gustav":
                System.out.println(st2.navn + " alder er  " + st2.alder);
                break;
            case "Andreas":
                System.out.println(st3.navn + " alder er  " + st3.alder);
                break;
            default:
                System.out.println("Person findes ikke");
        }
    }
}
