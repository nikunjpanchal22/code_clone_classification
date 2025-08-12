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




public void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                print(j);
            }
            for (int k = min; k < i; k ++) {
                print(k);
            }
            newLine();
        }
    }

    private void print(int n) { System.out.print(n); }
    private void newLine() { System.out.println(); 
}


