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
    for (int i = 0;
    i <= (max - min); i ++) {
        for (int j = max;
        j >= (max - i); j --) {
            System.out.print (j);
        }
        for (int k = 0;
        k < i; k ++) {
            System.out.print (min + k);
        }
        System.out.println ();
    }
}


