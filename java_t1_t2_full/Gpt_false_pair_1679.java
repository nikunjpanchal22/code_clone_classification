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


 public static void main(String args[]) {
        int i;
        int largestSize = 4;
        int array[] = {33, 55, 13, 46, 87, 42, 10, 34};
        int large[] = Arrays.copyOf(array, largestSize);
        int smallest =Integer.MAX_VALUE;
        int smallestIndex = 0;
        for (int y = 0; y < large.length; y++) {
            if (smallest > large[y]) {
                smallest = large[y];
                smallestIndex = y;
            }
        }

        for (i = large.length; i < array.length; i++) {
            if (smallest < array[i]) {
                large[smallestIndex] = array[i];
                smallest = Integer.MAX_VALUE;
                smallestIndex = 0;
                for (int x = 0; x < large.length; x++) {
                    if (smallest > large[x]) {
                        smallest = large[x];
                        smallestIndex = x;
                    }
                }
            }
        }

        for (int j = 0; j < large.length; j++) {
            System.out.println("Largest 5: " + large[j]);
        }
        System.out.println();
        System.out.println("Largest is: " + getHighest(large));
}
