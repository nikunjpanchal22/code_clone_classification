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


 public static int[][] getRows(int l, int m, int[][] array) 
{ 
    int rows = m - l + 1;
    int[][] result = new int[rows][];
    int j = 0;
    
    for (int i = l; i <= m; i++) 
    { 
        result[j++] = array[i];
    } 
    return result; 
} 


