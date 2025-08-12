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
import java.util.stream.*;

public class Main {
        public static void main(String[] args) {
            int n = 15;
            int[][] pascal = IntStream.range(0, n + 1).mapToObj(i -> {
            int[] row = new int[i + 2];
            if (i >= 1) {
                row[1] = 1;
                for (int j = 2; j < row.length - 1; j++) {
                row[j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
            return row;
            }).toArray(int[][]::new);

            Arrays.stream(pascal).skip(1).map(row -> 
            IntStream.range(1, row.length - 1).mapToObj(j -> 
                Integer.toString(row[j])
            ).collect(Collectors.joining(" "))
            ).forEach(System.out::println);
        }
}


