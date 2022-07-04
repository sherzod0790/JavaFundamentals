import java.util.Scanner;

public class Matrix56 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n, m, k, l = 1;
        System.out.print("m = ");m = sc.nextInt();
        System.out.print("n juft son bo'lishi lozim\nm = ");n = sc.nextInt();
        int[][] a = new int[m][n];

        k = n / 2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = l;
                l++;
            }
        }

        System.out.println("Main Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }



        System.out.println("Logic Matrix");
        for (int j = 0; j < n / 2; j++) {
            for (int i = 0; i < m; i++) {
                l = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = l;
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
