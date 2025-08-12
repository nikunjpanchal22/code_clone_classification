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
        int[] indices = new int[r];
        int totalCombinations = (int)Math.pow(values.length, r);
        for(int iteration = 0; iteration < totalCombinations; iteration++) {
            for(int rc = 0; rc < r; rc++) {
                System.out.print(values[indices[rc]] + " ");
                incrementIndex(values, indices, rc);
            }
            System.out.println();
        }
    }

    private static void incrementIndex(char[] values, int[] indices, int index) {
        if (indices[index] < values.length - 1) {
            indices[index]++;
        } else {
            indices[index] = 0;
        }
}


