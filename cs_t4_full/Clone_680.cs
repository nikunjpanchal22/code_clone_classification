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
    foreach (int [] arr in arr2D) {
        int total = 0;
        foreach (int num in arr) {
            total += num;
        }
        sums[rowSums] = total;
        rowSums ++;
    }
    return sums;
}


