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


 public static void main (String [] args) {Scanner s = new Scanner (System.in); 
    int number = s.nextInt ();
    int array [] [] = new int [number] [number]; 
    for (int counter1 = 0; counter1 < number; counter1 ++) {
        for (int counter2 = 0; counter2 < number; counter2 ++) 
        {
            array [counter1] [counter2] = s.nextInt ();
        }
    }
    int left_diagonal_sum = 0;
    for (int element1 = 0; element1 < number; element1 ++) 
    {
        left_diagonal_sum += array [element1] [element1];
    }
    int right_diagonal_sum = 0;
    for (int element2 = 0; element2 < number; element2 ++) 
    {
        right_diagonal_sum += array [element2][number - 1 - element2];
    }
    int total_sum = left_diagonal_sum + right_diagonal_sum;
    System.out.println (total_sum);
}
