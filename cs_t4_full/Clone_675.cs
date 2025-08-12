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
        int count = 0;
        foreach (int num in arr2D[i]) {
            count += num;
        }
        sums[rowSums] = count;
        rowSums ++;
    }
    return sums;
}


