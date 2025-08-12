public int solution (int X, int [] A) {
    int len = A.length;
    if (X > len) {
        return - 1;
    }
    int [] isFilled = new int [X];
    int jumped = 0;
    Arrays.fill (isFilled, 0);
    for (int i = 0;
    i < len; i ++) {
        int x = A [i];
        if (x <= X) {
            if (isFilled [x - 1] == 0) {
                isFilled [x - 1] = 1;
                jumped += 1;
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}


 
public int solution (int X, int [] A) {
    int len = A.length;
    if (X > len) {
        return - 1;
    }
    // Create an array of booleans to store the indices
    boolean[] isFilled = new boolean[X];
    int jumped = 0;
    // Loop through the array
    for (int i = 0; i < len; i++) {
        // Get the value of the current element
        int x = A[i];
        // If the value is in the required range
        if (x <= X) {
            // If it was not found before, set the corresponding index of the array to true
            if (!isFilled[x - 1]) {
                isFilled[x - 1] = true;
                jumped += 1;
                // If all were found, return the i index
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}


