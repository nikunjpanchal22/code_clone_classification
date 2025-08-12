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

    for(int i=start, cnt = 0; i <= end; i++, cnt++)
    {
        result[cnt] = array[i];
    }
    return result;
}


