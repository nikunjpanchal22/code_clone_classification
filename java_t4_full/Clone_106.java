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


 public static int[][] getRows(int start, int end, int[][] arr)
{
    int rows = end - start + 1;
    int[][] result = new int[rows][];

    for(int i = start, j = 0; i <= end; i++, j++) 
    {
        result[j] = arr[i];
    }
    return result;
}


