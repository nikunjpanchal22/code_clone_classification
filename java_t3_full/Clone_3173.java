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
    char [] arr = {'a', 'b', 'c', 'd'};
    int size = arr.length;
    int r = 2;
    int [] index = new int [r];
    for(int j = 0; j < Math.pow (size, r); j++) {
        for(int rc = 0; rc < r; rc++) {
            System.out.print (arr [index [rc]] + " ");
            if (index [rc] < size - 1) {
                index [rc]++;
                break;
            } else {
                index [rc] = 0;
            }
        }
        System.out.println();
    }
}


