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
    // Create a list which marks which values have been found
    List<Boolean> isFilled = new ArrayList<Boolean>();
    for (int i = 0; i < X; i++)
    {
        isFilled.add(false);
    }
    int jumped = 0;
    for (int i = 0; i < len; i++) {
        int x = A[i];
        if (x <= X) {
            // Set the value of the index to true if it was not found before
            if (!isFilled.get(x - 1)) {
                isFilled.set(x - 1, true);
                jumped += 1;
            }
            // Return the i index once all values were found
            if (jumped == X) {
                return i;
            }
        }
    }
    return - 1;
}


