package Kapitel_5;

public class Task15 {
    public static void main(String[] args) {
        int tal = 33;
        for (int i = 0; i < 10 ; i++) {
            System.out.println();
            for (int j = 0; j <10 ; j++) {
                if (tal == 127){
                    break;
                }else
                System.out.print((char)tal + " ");
                tal++;
            }
        }
    }
}
