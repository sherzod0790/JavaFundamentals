package Sikl;

public class TaskPeramida {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int x = 0; x <= n - i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

