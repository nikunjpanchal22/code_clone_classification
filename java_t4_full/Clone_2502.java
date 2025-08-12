public static void main (String [] args) {
    for (int i = 0;
    i < 9; i ++) {
        for (int j = 0;
        j < 9; j ++) {
            for (int k = 0;
            k < 9; k ++) {
                if (condition1) {
                    System.out.println ("Breaking from Loop K and J");
                    k = 9;
                    j = 9;
                }
                if (condition2) {
                    System.out.println ("Breaking from Loop K, J and I");
                    k = 9;
                    j = 9;
                    i = 9;
                }
            }
        }
    }
    System.out.println ("End of I , J , K");
}




public static void main (String [] args) {
    int i = 0, j = 0, k = 0;
    while (i < 9) {
        while (j < 9) {
            while (k < 9) {
                if (condition1) {
                    System.out.println ("Breaking from Loop K and J");
                    k = j = 10;
                } else if (condition2) {
                    System.out.println ("Breaking from Loop K, J and I");
                    k = j = i = 10;
                }
                k++;
            }
            j++;
        }
        i++;
    }
    System.out.println ("End of I , J , K");
}


