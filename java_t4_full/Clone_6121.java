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
        String [] values = {"a", "b", "c", "d"};
        int r = 2;
        int rc = 0;
        int [] i = new int [r];
        int totalRuns = (int) Math.pow(values.length, r);
        for(int j = 0; j < totalRuns; j ++) {
            printCharArr(values, r, i);
            incrementPointer(values, r, i);
            System.out.println ();
        }
    }

    private static void printCharArr(String [] values, int r, int[] i) {
        int rc = 0;
        while(rc < r) {
            System.out.print (values [i [rc]] + " ");
            rc ++;
        }
    }

    private static void incrementPointer(String [] values, int r, int [] i){
        int rc = 0;
        while(rc < r) {
            i [rc] = i[rc]<values.length - 1 ? ++i[rc] : 0;
            rc ++;
        }
}


