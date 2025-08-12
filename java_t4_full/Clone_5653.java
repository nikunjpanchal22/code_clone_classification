public static void main (String [] args) {
    int n = 7;
    int mid = n / 2;
    for (int i = 0;
    i < n; i ++) {
        for (int j = 0;
        j < Math.abs (mid - i) + 1; j ++) {
            System.out.print ("*");
        }
        System.out.println ();
    }
}




public static void main (String [] args) {
    for (int i = 0, n = 7; i < n; i ++) {
        for (int j = 0; j <= Math.abs(n / 2 - i); j ++) {
            System.out.print ("*");
        }
        System.out.println ();
    }
}


