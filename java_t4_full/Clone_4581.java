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
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[][] array = arrayInput(size, scanner);
            System.out.println(sum(array, size));
        }
        public static int[][] arrayInput(int size, Scanner scanner){
            int[][] array = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            return array;
        }
        public static int sum(int[][] array, int size){
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < size; i++) {
                leftSum += array[i][i];
                rightSum += array[i][size - i - 1];
            }
            return leftSum + rightSum;
}


