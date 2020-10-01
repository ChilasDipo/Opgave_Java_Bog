package Kapitel_5;

public class Task7 {
    public static void main(String[] args) {
double tuition = 10000;
double[] tuituionperyear = new double[14];
        for (int i = 0; i <= 13 ; i++) {
            tuition = tuition*1.06;
            tuituionperyear[i] = tuition;
            //System.out.println(tuition);
        }

        System.out.println(tuituionperyear[9]+tuituionperyear[10]+tuituionperyear[11]+tuituionperyear[12]+tuituionperyear[13]);

    }
}
