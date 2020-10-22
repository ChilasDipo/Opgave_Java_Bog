package Kapitel_4;

import zunit.TestSuite;

public class TestsuiteforTast9 {
    public static void main(String[] args) {
        testforE(Task9.unicodeconverter('E'));
        testfor5(Task9.unicodeconverter('5'));

    }

    public static void testforE(int character){
        if (character == 69){
            System.out.println("Pass E");
        }else System.out.println("fail E");
    }
    public static void testfor5(int character){
        if (character == 53){
            System.out.println("Pass 5");
        }else System.out.println("fail 5");
    }

}
