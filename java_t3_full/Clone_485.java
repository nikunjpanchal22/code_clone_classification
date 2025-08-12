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
     //Create an array which stores the found indices 
    int[] isFilled = new int[X];
    int jumped = 0;
    // Set the indices to -1, meaning that the value has not been found yet
    for (int i = 0; i < X; i++)
    {
        isFilled[i] = -1;
    }
    // Go through the array
    for (int i = 0; i < len; i++) {
        int x = A[i];
        if (x <= X) {
            // Check whether the index was already found. If not, then set it to i.
            if (isFilled[x - 1] == -1) {
                isFilled[x - 1] = i;
                jumped += 1;
            }
            // Check whether all indices have been found
            if (jumped == X) {
                // Get the maximum index of all found ones
                int max = 0;
                for (int j = 0; j < X; j++) {
                    max = Math.max(max, isFilled[j]);
                }
                // Return the maximum index
                return max;
            }
        }
    }
    return - 1;
}


