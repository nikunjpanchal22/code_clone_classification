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
    int smallestSize = 4;
    int array [] = {33, 55, 13, 46, 87, 42, 10, 34};
    int small [] = Arrays.copyOf (array, smallestSize);
    int largest = small [0];
    int largestIndex = 0;
    for (int j = 1; j < small.length; j++) {
        if (largest < small [j]) {
            largest = small [j];
            largestIndex = j;
        }
    }
    for (int i = small.length; i < array.length; i++) {
        if (largest > array [i]) {
            small [largestIndex] = array [i];
            largest = small [0];
            largestIndex = 0;
            for (int j = 1; j < small.length; j++) {
                if (largest < small [j]) {
                    largest = small [j];
                    largestIndex = j;
                }
            }
        }
    }
    for (int j = 0; j < small.length; j++) {
        System.out.println ("smallest 4 : " + small [j]);
    }
    System.out.println ("smallest is: " + getLowest (small));
}


