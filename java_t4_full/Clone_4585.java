public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int a [] [] = new int [n] [n];
    for (int a_i = 0;
    a_i < n; a_i ++) {
        for (int a_j = 0;
        a_j < n; a_j ++) {
            a [a_i] [a_j] = in.nextInt ();
        }
    }
    int l_sum = 0;
    for (int i = 0;
    i < n; i ++) {
        l_sum += a [i] [i];
    }
    int r_sum = 0;
    for (int j = 0;
    j < n; j ++) {
        r_sum += a [j] [n - 1 - j];
    }
    int sum = l_sum + r_sum;
    System.out.println (sum);
}






public class Diagonal {
    private static class DiagonalSum {
        private int l_sum = 0;
        private int r_sum = 0;

        private void left(int val) {
            l_sum += val;
        }

        private void right(int val) {
            r_sum += val;
        }

        int total() {
            return l_sum + r_sum;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        DiagonalSum ds = new DiagonalSum();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (i == j)
                    ds.left(a[i][j]);
                if (i == n - j - 1)
                    ds.right(a[i][j]);
            }
        }
        System.out.println(ds.total());
    }
}


