public static void main (String [] args) {
    char [] values = {'a', 'b', 'c', 'd'};
    int n = values.length;
    int r = 2;
    int i [] = new int [r];
    int rc = 0;
    for (int j = 0;
    j < Math.pow (n, r); j ++) {
        rc = 0;
        while (rc < r) {
            System.out.print (values [i [rc]] + " ");
            rc ++;
        }
        System.out.println ();
        rc = 0;
        while (rc < r) {
            if (i [rc] < n - 1) {
                i [rc] ++;
                break;
            } else {
                i [rc] = 0;
            }
            rc ++;
        }
    }
}




public static void main (String [] args) {
        char [] values = {'a', 'b', 'c', 'd'};
        int r = 2;
        int[] index = new int[r];
        int totalIterations = (int)Math.pow(values.length, r);
        for (int j = 0; j < totalIterations; j++) {
            printValues(values, r, index);
            incrementOrResetIndex(values, r, index);
            System.out.println();
        }
    }

    private static void printValues(char[] values, int r, int[] index) {
        for (int rc = 0; rc < r; rc++) {
            System.out.print(values[index[rc]] + " ");
        }
    }

    private static void incrementOrResetIndex(char[] values, int r, int[] index) {
        for (int rc = 0; rc < r; rc++) {
            if (index[rc] < values.length - 1) {
                index[rc]++;
                break;
            } else {
                index[rc] = 0;
            }
        }
}


