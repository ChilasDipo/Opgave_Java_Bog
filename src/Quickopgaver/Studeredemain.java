package Quickopgaver;

import java.util.Scanner;

public class Studeredemain {
    public static void main(String[] args) {
        Studerende st1 = new Studerende();
        st1.navn = "Lasse";
        st1.alder = 22;
        st1.by = "skuerløse";


        Studerende st2 = new Studerende();
        st2.navn = "Gustav";
        st2.alder = 24;
        st2.by = "skuerløse";


        Studerende st3 = new Studerende();
        st3.navn = "Andreas";
        st3.alder = 23;
        st3.by = "skuerløse";


        Studerende st4 = new Studerende();
        st4.navn = "someone";
        st4.alder = 22;
        st4.by = "skuerløse";
        System.out.println("Studerede oprettede");
        Scanner input = new Scanner(System.in);
        System.out.println("Navn på den alder du ønsker at kende");
        String name = input.next();
        switch (name){
            case "Lasse":
                System.out.println(st1.navn + " alder er  " + st1.alder);
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
