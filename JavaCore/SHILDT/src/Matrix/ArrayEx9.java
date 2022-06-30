package Matrix;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many rows you want?");
        int r = sc.nextInt();

        System.out.println("Enter how many cols you want?");
        int c = sc.nextInt();

        int[][] matA = new int[r][c];
int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matA[i][j] = k++;
            }
        }

        System.out.println("Original matrix is: ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("уфуцйуйOriginal matrix is: ");

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose matrix is: ");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matA[j][i] + "\t");
            }
            System.out.println();
        }




    }
}
