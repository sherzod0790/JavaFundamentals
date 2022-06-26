package Matrix;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int matrixA[][] = new int[a][b];
        int matrixB[][] = new int[a][b];

        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                k++;
                matrixA[i][j] = k;
            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }


    }

}
