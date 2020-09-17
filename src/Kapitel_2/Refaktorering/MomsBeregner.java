package Kapitel_2.Refaktorering;
import java.util.Scanner;

public class MomsBeregner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Indsæt prisen af køb:   ");
        double kob = input.nextDouble();
        System.out.print("Skriv 1 for tysk moms og 2 for Dansk   ");
        int land = input.nextInt();
        double moms = -1;
        if (land == 1 ) {
             moms = plusDanskMoms(kob);
        }else if (land == 2) {
             moms = plusTyskMoms(kob);
        }else {
            System.out.print("ugyldigt land   ");
        }
        System.out.println("Momsen er  " + (int) (moms * 100) / 100.0);
    }
    public static double plusDanskMoms(double kob){
        return  kob * 0.25;
    }
    public static double plusTyskMoms(double kob){
        return  kob * 0.16;
    }
}

