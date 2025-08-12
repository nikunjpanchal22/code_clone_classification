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


 public static void main (String [] args) {Scanner inp = new Scanner (System.in); 
    int dimen = inp.nextInt ();
    int twodarr [][] = new int [dimen] [dimen]; 
    for (int n = 0; n < dimen; n ++) {
        for (int m = 0; m < dimen; m ++) {
            twodarr [n][m] = inp.nextInt ();
        }
    }
    int lsum = 0;
    for (int i = 0; i < dimen; i ++) {
        lsum += twodarr [i][i];
    }
    int rsum = 0;
    for (int j = 0; j < dimen; j ++) {
        rsum += twodarr [j][dimen - 1 - j];
    }
    int total = lsum + rsum;
    System.out.println (total);
}
