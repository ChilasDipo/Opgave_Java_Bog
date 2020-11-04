package Quickopgaver.ArrayTrainging.coloropgave;

public class Array {
   static String[] farver = {"Blue" , "Yellow", "Gray", "Pink" };
   static String[] y = {farver[0],farver[1],farver[2],farver[3] };
    Colors colors;

    public Array(Colors color) {
        this.colors = color;
    }

    public Array() {

    }

    public static void main(String[] args) {
        int z = 3;
        System.out.println(y[z]);

        Array opgave = new Array();
        opgave = new Array(Colors.Blue);
        System.out.println(opgave.colors);

    }



}
