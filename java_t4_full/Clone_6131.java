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
        int [] i = new int [r];
        for(int j = 0; j < Math.pow (values.length, r); j ++) {
            for(int rc = 0; rc < r; rc++) {
                printElement(values, i, rc);
                incrementPointer(values, i, rc);
            }
            System.out.println ();
        }
    }

    private static void printElement(char[] values, int[] i, int rc) {
        System.out.print (values [i [rc]] + " ");
    }

    private static void incrementPointer(char[] values, int[] i, int rc) {
        if (i [rc] < values.length - 1) {
            i [rc] ++;
        } else {
            i [rc] = 0;
        }
}


