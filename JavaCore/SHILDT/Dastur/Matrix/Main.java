import java.util.Scanner;
import java.util.Date;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[][] a = new int[10][10];

        int k = 1;
        int row = 0, col = n - 1, colLeft = 0, rowDown = n - 1;

        while (col >= row) {
            //yuqori satr elementlariga qoshamiz
            for (int j = colLeft; j < col; j++){
                a[row][j] = k++;
            System.out.print(a[row][j]);}

            // ong satr elementlariga qoshamiz
            for (int i = row; i < rowDown; i++)
                a[i][col] = k++;

            // pastki satr elementlariga teskari tartibda qo'shamiz
            for (int j = col; j > colLeft; j--)
                a[rowDown][j] = k++;

            // chapdagi ustun elementlariga teskari tartibda chiqaramiz
            for (int i = rowDown; i > row; i--)
                a[i][colLeft] = k++;

            row++;
            rowDown--;
            col--;
            colLeft++;
        }
        // n - toq bolsa markazdagi elementni yozamiz
        if (n % 2 == 1)
            a[n / 2][n / 2] = k;

        // matrix ni jadval shaklda chiqarish
        System.out.println("Matrix elementlari");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        Date date = new Date();
        System.out.println(date);

    }
}
