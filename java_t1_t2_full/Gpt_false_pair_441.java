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
    int[] isFilled = new int[X]; 
    // Set all BOOL values to 0
    Arrays.fill(isFilled, 0);
    int jumped = 0;
    // Go through the array 
    for (int i = 0; i < len; i++) {
        int x = A[i];
        if (x <= X) {
            // If the value is 0, then set it to 1
            if (isFilled[x - 1] == 0) {
                isFilled[x - 1] = 1;
                jumped += 1;
            }
            // Once all values have been filled, return the i index
            if (jumped == X) {
                return i;
            }
        }
    }
    return - 1;
}
