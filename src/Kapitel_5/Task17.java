package Kapitel_5;

public class Task17 {
    public static void funk(int n) {
        int permn = n;
        for (int i = 0; i < permn; i++) {
            funktion(n);
            System.out.println();
            n--;
        }
    }

    public static void funktion(int n) {
        int permn = n * 2 - 1;
        int[] arr = new int[permn];
        for (int i = 0; i < permn; i++) {
            if (n == 1) {
                arr[i] = n;
                n++;
            } else if (n > 1 && i < (permn / 2)) {
                arr[i] = n;
                n--;
            } else {
                arr[i] = n;
                n++;
            }
        }
        for (int h = 0; h < permn; h++) {
            System.out.print(arr[h] + "  ");
        }
    }


}
