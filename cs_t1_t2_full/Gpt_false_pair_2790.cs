public static int [] RowSums (int [] [] arr2D) {
    int [] sums = new int [arr2D.GetLength (0)];
    int rowSums = 0;
    foreach (int [] arr in arr2D) {
        sums [rowSums] = ArraySum (arr);
        rowSums ++;
    }
    return sums;
}


public static int [] RowTotals (int [] [] arr2D) {
    int [] totals = new int [arr2D.GetLength (0)];
    int rowTotals = 0;
    foreach (int [] arr in arr2D) {
        totals [rowTotals] = ArraySum (arr);
        rowTotals ++;
    }
    return totals;
}
