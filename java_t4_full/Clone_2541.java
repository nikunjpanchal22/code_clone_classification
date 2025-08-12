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
    int[][] result = new int[j-i+1][];
    java.util.Deque<int[]> deque = new java.util.ArrayDeque<>();
    while (i <= j)
        deque.add(array[i++]);
    return deque.toArray(result);
}


