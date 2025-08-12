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


 public static int[][] getRows(int start, int end, int[][] array)
{
    int rowSize = end - start + 1;
    int[][] result = new int[rowSize][];

    for(int i = 0; start <= end; i++, start++) 
    {
        result[i] = array[start];
    }
    return result;
}


