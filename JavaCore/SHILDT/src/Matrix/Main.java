package Matrix;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

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
//        Scanner sc = new Scanner(System.in);
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
//        Scanner sc = new Scanner(System.in);
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
        int number, first;

        System.out.print("Enter length array: ");
        number = sc.nextInt();

        int matrix[] = new int[number];

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("a[" + i + "] = ");
            matrix[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }

        for (int i = 0; i < matrix.length; i++)
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i] > matrix[j]) {
                    first = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = first;
                }
            }

        System.out.println("Sort Asc Array:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }

        for (int i = 0; i < matrix.length; i++)
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i] < matrix[j]) {
                    first = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = first;
                }
            }

        System.out.println("Sort Desc Array:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }


    }

}
