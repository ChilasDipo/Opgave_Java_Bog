package Kapitel_10;

import java.math.BigInteger;

public class Task16 {
    // Divisible by 2 or 3 ) Find the first 10 numbers with 50 diceimals digitgs that are divisbles by 2 or 3

    public static void main(String[] args) {
        Task16 opgave = new Task16();
        int counting = 0;
        int number = 0;             // do not change to BigInteger number too big almost infinite loop
        int[] numberarray = new int[10];
        while (counting < 10 ){
            if (opgave.numberofdigits(number)>7){
                if (opgave.divisiblityby2or3(number)==true){
                    if (opgave.exitinarray(numberarray,number)==false){
                        numberarray[counting]=number;
                        counting++;
                    }else {number++;}
                }  else{
                    number++;
                }
            }else {
                number++;
            }
        }

        for (int i = 0; i < numberarray.length ; i++) {
            System.out.println(numberarray[i] +  "  ");
        }

    }

    public int numberofdigits(int number){
    int numberofdigits=0;
    while (number != 0){
            number = number / 10;
            numberofdigits++;
        }
        return numberofdigits;
    }

    public boolean divisiblityby2or3(int number){
        BigInteger a = new BigInteger("2");
        BigInteger b = new BigInteger("2");
        boolean divisiblityby2or3 = false;
        if ((number%2==0) || (number%3==0)){
            divisiblityby2or3 = true;
        }
        return divisiblityby2or3;
    }

    public boolean exitinarray(int[] array, int number){
        boolean exit = false;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==number){
                return true;
            }
        }
        return exit;
    }

}
