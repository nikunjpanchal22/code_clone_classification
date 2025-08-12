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
    int array[] = {33, 55, 13, 46, 87, 42, 10, 34};
    int largestSize = 4;
    int large[] = Arrays.copyOf(array, largestSize);
    int minIndex = 0;
    int minValue = large[0];

    for (i = 1; i<large.length; i++){
        if (minValue > large[i]){
            minValue = large[i];
            minIndex = i;
        }
    }
    for (int j = large.length; j<array.length; j++){
        if (minValue < array[j]) {
            large[minIndex] = array[j];
            minValue = large[0];
            minIndex = 0;
            for (int k = 1; k < large.length; k++) {
                if (minValue > large[k]) {
                    minValue = large[k];
                    minIndex = k;
                }
            }
        }
    }
    for (int l = 0; l<large.length; l++){
        System.out.println("Largest " + (l + 1) + ": " + large[l]);
    }
    System.out.println();
    System.out.println("Largest is: " + getHighest(large));
}


