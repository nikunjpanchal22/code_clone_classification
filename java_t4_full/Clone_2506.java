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
    int[][][] arr = new int[9][9][9];
    scan:
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            for (int k = 0; k < arr[i][j].length; k++) {
                if (condition1) {
                    System.out.println ("Breaking from Loop K and J");
                    break scan;
                }
                if (condition2) {
                    System.out.println ("Breaking from Loop K, J and I");
                    i = j = k = 10;
                    break;
                }
            }
        }
    }
    System.out.println ("End of I , J , K");
}


