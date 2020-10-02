package Kapitel_5;

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[196];
        int i, m = 0, flag = 0, k=0;
       // int j = 3;//it is the number to be checked

        for (int j = 0; j < 1201; j++) {
            flag = 0;
            m = j / 2;
            if (j == 0 || j == 1) {
                flag = 1;
            } else {
                for (i = 2; i <= m; i++) {
                    if (j % i == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    array[k] = j;
                    k++;
                }
            }
        }
        for (int j = 0; j < array.length ; j++) {
            System.out.println(array[j] + "   " + j);
        }
        printing(array);
    }

    public static void printing(int[] array){
        int tal = 0;
        for (int i = 0; i < array.length ; i++) {
            System.out.println();
            for (int j = 0; j <10 ; j++) {
                if (tal == 196){
                    break;
                }else
                    System.out.print(array[tal] + " ");
                tal++;
            }
        }
    }
}
