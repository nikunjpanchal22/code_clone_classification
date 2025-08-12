public static int [] [] getRows (int i, int j, int [] [] array) {
    int [] [] another = new int [j - i + 1] [];
    while (i <= j) {
        for (int k = 0;
        k < another.length; k ++) {
            another [k] = array [i];
            i ++;
        }
    }
    return another;
}



 

public static int[][] getRows (int i, int j, int[][] array) {
    int[][] result = new int[j - i + 1][];
    int r = 0;
    do {
        result[r] = array[i];
        r++; i++;
    } while (i <= j);
    return result;
}


