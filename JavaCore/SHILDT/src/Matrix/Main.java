package Matrix;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        int a = 5;
//        int b = 5;
//        int matrixA[][] = new int[a][b];
//        int matrixB[][] = new int[a][b];
//
//        int k = 0;
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                k++;
//                matrixA[i][j] = k;
//            }
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(matrixA[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println(matrixA[2][3]);
//
//    }

//    public static void main(String[] args) {
//        Scanner kiritish = new Scanner(System.in);
//        int matrix[][] = new int[4][6];
//
//        int k = 1;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = k; k++;
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//    }


    // karra jadvali
//    public static void main(String[] args) {
//        Scanner kiritish = new Scanner(System.in);
//        int matrix[][] = new int[10][10];
//
//        for (int i = 1; i < matrix.length; i++) {
//            for (int j = 1; j < matrix[i].length; j++) {
//                matrix[i][j] = i*j;
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//    }


    public static void main(String[] args) {
        Scanner kiritish = new Scanner(System.in);
        int matrix[][] = new int[4][6];

        int k = 1;
        int ongPast, ongChap, chapTepa;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k; k++;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
