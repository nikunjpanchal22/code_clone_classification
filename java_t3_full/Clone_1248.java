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
    int array[] = {33, 55, 13, 46, 87, 42, 10, 34};
    int largestSize = 4;
    int large[] = Arrays.copyOf(array, largestSize);
    int smallestIndex = 0;
    int smallestValue = large[0];

    for (i = 1; i < large.length; i++) {
        if (smallestValue > large[i]) {
            smallestValue = large[i];
            smallestIndex = i;
        }
    }

    while (i < array.length) {
        if (smallestValue < array[i]) {
            large[smallestIndex] = array[i];
            smallestIndex = 0;
            smallestValue = large[0];

            for (int j = 0; j < large.length; j++) {
                if (smallestValue > large[j]) {
                    smallestValue = large[j];
                    smallestIndex = j;
                }
            }
        }
        i++;
    }

    for (int j = 0; j < largestSize; j++) {
        System.out.println("Largest " + (j + 1) + ": " + large[j]);
    }
    System.out.println();
    System.out.println("Largest is: " + getHighest(large));
}


