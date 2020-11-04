package Kapitel_7;

import java.util.Scanner;
import java.util.ArrayList;

public class Task5UI {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int size = 0;
        Task5UI opgave = new Task5UI();
        Scanner input = new Scanner(System.in);
        System.out.println("inp");
        

        while (numbers.contains(0) == false){
            int n = input.nextInt();
            numbers.add(n);

    }
        int[] array = new int[numbers.size()]; ;
            for (int i =0; i < numbers.size(); i++)
                array[i] = numbers.get(i);
            Task5.calling(array);
        }



    }
