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
            if(min<=max){
                printSquare(min, max, min, max);
            }
        }

        private void printSquare(int min, int max, int i, int j) {
            if(i <= j) {
                System.out.print(i);
                printSquare(min, max, i+1, j);
            } else {
                System.out.println();
                if(min <= max-1) {
                    printSquare(min+1, max);
                }
            }
}


