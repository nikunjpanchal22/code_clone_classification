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
        foreach (int item in arr2D[i]) {
            sum += item;
        }
        sums [rowSums] = sum;
        rowSums ++;
    }
    return sums;
}


