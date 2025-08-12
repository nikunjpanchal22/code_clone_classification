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
        for (int j = max;
        j >= min; j --) {
            if(j <= i) {
                System.out.print (j);
            } else {
                System.out.print (j + 1);
            }
        }
        System.out.println ();
    }
}


