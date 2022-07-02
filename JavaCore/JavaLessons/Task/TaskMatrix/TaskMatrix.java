import java.util.Scanner;

public class TaskMatrix {

    public static Scanner sc = new Scanner(System.in);


    static void principalDiagonal(int mat[][])
    {

        System.out.println("Principal Diagonal");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (i == j || j <= i) {
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println("\nThe lower part of the main diagonal is replaced by ZERO");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

    }


    static void secondaryDiagonal(int mat[][])
    {
        System.out.println("Secondary Diagonal");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if ((i + j) >= mat.length - 1 ) {
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println("\nThe lower part of the Secondary diagonal is replaced by ZERO");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] inputVal(int[][] arr){

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                k++;
                arr[i][j] = k;
            }
        }
        return arr;
    }

    static void addArrayElements(int[][] arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
                sum += arr[i][j];
            }
            System.out.println("\tSumma elemtns: " + sum);
        }

    }
    // Driver code
    public static void main(String args[])
    {
        int col, row;
        System.out.print("Enter the number of rows: "); row = sc.nextInt();
        System.out.println();
        System.out.print("Enter the number of columns: "); col = sc.nextInt();

        int[][] arr = new int[row][col];

        arr = inputVal(arr);

        principalDiagonal(arr);
        secondaryDiagonal(arr);
        addArrayElements(arr);
    }

}
