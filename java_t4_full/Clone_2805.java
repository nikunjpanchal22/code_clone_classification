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
    for(int i = min; i <= max; i++){
        StringBuilder printLine = new StringBuilder();
        for(int j = i; j <= max; j++)
            printLine.append(j);
        for(int k = min; k < i; k++)
            printLine.append(k);
        System.out.println(printLine.toString());
    }
}


