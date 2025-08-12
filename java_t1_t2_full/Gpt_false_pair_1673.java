public static void main (String args []) {
    int i;
    int largestSize = 4;
    int array [] = {33, 55, 13, 46, 87, 42, 10, 34};
    int large [] = Arrays.copyOf (array, largestSize);
    int smallest = large [0];
    int smallestIndex = 0;
    for (int j = 1;
    j < large.length; ++ j) {
        if (smallest > large [j]) {
            smallest = large [j];
            smallestIndex = j;
        }
    }
    for (i = large.length; i < array.length; i ++) {
        if (smallest < array [i]) {
            large [smallestIndex] = array [i];
            smallest = large [0];
            smallestIndex = 0;
            for (int j = 1;
            j < large.length; ++ j) {
                if (smallest > large [j]) {
                    smallest = large [j];
                    smallestIndex = j;
                }
            }
        }
    }
    for (int j = 0;
    j < large.length; j ++) {
        System.out.println ("Largest 5 : " + large [j]);
    }
    System.out.println ();
    System.out.println ("Largest is: " + getHighest (large));
}


 public static void main (String args []) {
    int i;
    int largestSize = 4;
    int array [] = {33, 55, 13, 46, 87, 42, 10, 34};
    int largest [] = Arrays.copyOf (array, largestSize);
    int minIndex = 0;
    int minValue = largest [0];
    for (int j = 1; j < largest.length; ++j) {
        if (minValue > largest [j]) {
            minValue = largest [j];
            minIndex = j;
        }
    }
    for (i = largest.length; i < array.length; ++i) {
        if (minValue < array [i]) {
            largest [minIndex] = array [i];
            minValue = largest [0];
            minIndex = 0;
            for (int k = 1; k < largest.length; ++k) {
                if (minValue > largest [k]) {
                    minValue = largest [k];
                    minIndex = k;
                }
            }
        }
    }
    for (int l = 0; l < largestSize; ++l) {
        System.out.println ("Largest " + (l + 1) + ": " + largest [l]);
    }
    System.out.println ();
    System.out.println ("Largest is: " + getHighest (largest));
}
