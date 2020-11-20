package Kapitel_12;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Chila\\IdeaProjects\\Opgave_Java_Bog\\src\\Kapitel_12\\testdata.txt");
        Task14 opgave = new Task14();
        System.out.println(opgave.readinFile("Gustav",file));
        System.out.println(opgave.readinFileStupidedition("Gustav",file));
        System.out.println(opgave.readinFile("Kurtsen",file));
        System.out.println(opgave.readinFileStupidedition("Kurtsen",file));
    }

    public int readinFile(String line, File file) throws Exception {
        Scanner input = new Scanner(file);
        int counting = 1;
        while (input.hasNext()){
            if (input.nextLine().equals(line)){
                return counting;
            }
            counting++;
        }
        return -1;
    }

    public int readinFileStupidedition(String line, File file) throws Exception {
        Scanner input = new Scanner(file);
        ArrayList<String> names = new ArrayList<String>();
        while (input.hasNext()){
            names.add(input.nextLine());
        }
        if (names.contains(line)){
            return names.indexOf(line)+1;
        }
        return names.indexOf(line);
    }
}
