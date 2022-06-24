package STRING;

import java.util.Scanner;

public class LessonString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int boshlangichSon = 1, oxirgiSon = n;
        int len = 2 * n - 1;

        for (int i = 0; i < n - 1; i++) {
            boshlangichSon = n - i;
            oxirgiSon = n + i;
            for (int j = 1; j <= len; j++) {
                if (j == boshlangichSon || j == oxirgiSon) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        boshlangichSon = 1;
        oxirgiSon = len;
        int urta = len / 2 + 1;
        for (int i = 1; i <= len; i++) {
            if (i == boshlangichSon || i == oxirgiSon || i == urta) System.out.print("*");
            else System.out.print(" ");
        }

//
//        for (int i = 1; i <= n; i++) {
//            if (i == boshlangichSon || i == n || i == (oxirgiSon / 2 + 1)) System.out.print("*");
//            else System.out.print(" ");
//        }

    }
}
