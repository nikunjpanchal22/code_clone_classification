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
        int [] index = new int [r];
        int totalCases = (int)Math.pow(values.length, r);

        for(int j = 0; j < totalCases; j ++) {
            for(int rc = 0; rc < r; rc++){
                System.out.print (values [index [rc]] + " ");
                index[rc] = incrementOrReset(values.length, index[rc]);
            }
            System.out.println ();
        }
    }

    private static int incrementOrReset(int limit, int current){
        if(current < limit - 1)
            return current + 1;
        else
            return 0;
}


