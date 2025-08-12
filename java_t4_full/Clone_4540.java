public static void main (String [] args) {
    int n = 15;
    int [] [] pascal = new int [n + 1] [];
    pascal [1] = new int [1 + 2];
    pascal [1] [1] = 1;
    for (int i = 2;
    i <= n; i ++) {
        pascal [i] = new int [i + 2];
        for (int j = 1;
        j < pascal [i].length - 1; j ++) pascal [i] [j] = pascal [i - 1] [j - 1] + pascal [i - 1] [j];
    }
    for (int i = 1;
    i <= n; i ++) {
        for (int j = 1;
        j < pascal [i].length - 1; j ++) {
            System.out.print (pascal [i] [j] + " ");
        }
        System.out.println ();
    }
}






import java.util.*;

public class Main {
        public static void main(String[] args) {
            int n = 16;
            int[][] pascal = buildPascal(n);
            printPascal(pascal);
        }

        private static int[][] buildPascal(int n) {
            int[][] pascal = new int[n][];
            pascal[0] = new int[3];
            pascal[0][1] = 1;
            for (int i = 1; i < n; i++) {
            pascal[i] = new int[i + 3];
            for (int j = 1; j < pascal[i].length - 1; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            }
            return pascal;
        }

        private static void printPascal(int[][] pascal) {
            for (int[] row : pascal) {
            for (int j = 1; j < row.length - 1; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
            }
        }
}


