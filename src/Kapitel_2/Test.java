package Kapitel_2;
public class Test {
    public static void main(String[] args) {
        TestTask1();
    }
    public static void TestTask1() {
        for (int i = 0; i < 101; i++) {
            if (Task1.test(i) == i * 1.6) {
                System.out.println("True for    " + i);
            } else {
                System.out.println("Nope for   " + i);
            }
        }
    }
}