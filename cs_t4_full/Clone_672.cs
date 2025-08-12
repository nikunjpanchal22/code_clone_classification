public static int [] RowSums (int [] [] arr2D) {
    int [] sums = new int [arr2D.GetLength (0)];
    int rowSums = 0;
    foreach (int [] arr in arr2D) {
        sums [rowSums] = ArraySum (arr);
        rowSums ++;
    }
    return sums;
}


 
public static int [] RowSums (int [] [] arr2D) {
    int [] sums = new int [arr2D.Length];
    int rowSums = 0;
    for (int i = 0; i < arr2D.Length; i++) {
        int sum = 0;
        for (int j = 0; j < arr2D[i].Length; j++) {
            int value = arr2D[i][j];
            sum += value;
        }
        int totalsum = sum;
        sums[rowSums] = totalsum;
        rowSums ++;
    }
    return sums;
}


