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
    int length = A.length;
    int result = -1; 
    if (X <= length) { 
        boolean[] filled = new boolean[X]; 
        int numberFilled = 0; 
        for (int i = 0; i < length; i++) { 
            int index = A[i] - 1; 
            if (!filled[index]) { 
                filled[index] = true; 
                numberFilled++; 
            } 
            if (numberFilled == X) { 
                result = i; 
                break; 
            } 
        } 
    } 
    return result;
}


