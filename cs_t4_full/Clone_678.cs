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
        int rowTotal = 0;
        foreach (int item in arr) {
            rowTotal = rowTotal + item;
        }
        sums[rowSums] = rowTotal;
        rowSums ++;
    }
    return sums;
}


