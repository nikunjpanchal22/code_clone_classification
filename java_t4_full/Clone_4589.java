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




public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int size = input.nextInt();
            int[][] arr = new int[size][size];
            fillMatrix(input, size, arr);
            System.out.println(sumMatrix(size, arr));
        }

        private static void fillMatrix(Scanner input, int size, int[][] arr) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
        }

        private static int sumMatrix(int size, int[][] arr) {
            int firstSum = 0, secondSum = 0;
            for (int i = 0; i < size; i++) {
                firstSum += arr[i][i];
                secondSum += arr[i][size - 1 - i];
            }
            return firstSum + secondSum;
}


