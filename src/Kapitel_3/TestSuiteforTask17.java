package Kapitel_3;

public class TestSuiteforTask17 {
    public static void main(String[] args) {
       // correctstringwonrock(Task17.gameRPS(1,0));
       // correctstringdraw(Task17.gameRPS(2,2));
     //   correctstringloss(Task17.gameRPS(1,2));
    }



    public static void correctstringwonrock(String choice) {
        if (choice.equals("The computer is scissor. You are rock. You won")) {
            System.out.println("Pass rock you won");
        } else System.out.println("fail rock you won");
    }
    public static void correctstringdraw(String choice) {
        if (choice.equals("The computer is paper. You are paper too. It is a draw")) {
            System.out.println("Pass paper draw");
        } else System.out.println("fail rock you won");
    }
    public static void correctstringloss(String choice) {
        if (choice.equals("The computer is paper. You are rock. You lose")) {
            System.out.println("Pass rock you lose");
        } else System.out.println("fail rock you lose");
    }

}

