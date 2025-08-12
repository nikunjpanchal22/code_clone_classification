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
    int[][] array = new int[size][size];
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            array[i][j] = input.nextInt();
        }
    }
    int firstDiagonal = 0, secondDiagonal = 0;
    for (int i = 0; i < size; i++) {
        firstDiagonal += array[i][i];
        secondDiagonal += array[i][size - 1 - i];
    }
    System.out.println(firstDiagonal + secondDiagonal);
}


