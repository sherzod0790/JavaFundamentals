import java.util.Date;
import java.util.Scanner;

public class Matrix55 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n, m, k, l = 1;
        System.out.print("m juft son bo'lishi lozim\nm = ");m = sc.nextInt();
        System.out.print("n = ");n = sc.nextInt();
        int[][] a = new int[m][n];

        k = m / 2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = l;
                l++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        
//        l = 0;
//        for (int i = 0; i < m; i++) {
//            if (i >= k) {
//
//                for (int j = 0; j < n; j++) {
//                    b[i][j] = a[l][j];
//                } l++;
//            } else for (int j = 0; j < n; j++) {
//                {
//                    b[i][j] = a[i + k][j];
//                }
//            }
//        }

        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n; j++) {
                l = a[i][j];
                a[i][j] = a[k][j];
                a[k][j] = l;
            }
            k++;
        }
        
        

        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
