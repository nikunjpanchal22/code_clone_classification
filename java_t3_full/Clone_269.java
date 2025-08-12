public void printSquare (int min, int max) {
    for (int i = min;
    i <= max; i ++) {
        for (int j = i;
        j <= max; j ++) {
            System.out.print (j);
        }
        for (int k = min;
        k < i; k ++) {
            System.out.print (k);
        }
        System.out.println ();
    }
}


 public void printSquare (int min, int max) {
    for (int i = max;
    i >= min; i --) {
        for (int j = min;
        j <= max; j ++) {
            System.out.print (j);
        }
        for (int k = (i + 1);
        k <= max; k ++) {
            System.out.print (k);
        }
        System.out.println ();
    }
}


