package Sikl;

public class TaskPiramida {

    public static void main(String[] args) {

        int n = 3;

        for (int i = 0; i < n-1; i++) {
            for (int x = 0; x <= n - i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 + 1; j++) {
                if(j == 1 || (j == i * 2 + 1))
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

