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
    int n = values.length; 
    int r = 2; 
    int i [] = new int [r]; 
    for (int j = 0; j < Math.pow (n, r); j ++) { 
        int rc = 0; 
        while (rc < r) { 
            System.out.print (values [i [rc]] + " "); 
            rc ++; 
        } 
        System.out.println (); 
        int k = 0;
        while (k < r && i[k] == n-1) {
            i[k] = 0;
            k++;
        }
        if (k < r) 
            i[k]++;
    }
}


