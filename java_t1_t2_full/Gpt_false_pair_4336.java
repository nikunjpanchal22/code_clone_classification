public int solution (int X, int [] A) {
    int list [] = A;
    int sum = 0;
    int searchedValue = X;
    int sumV = searchedValue * (searchedValue + 1) / 2;
    List < Integer > arrayList = new ArrayList < Integer > ();
    for (int iii = 0;
    iii < list.length; iii ++) {
        if (list [iii] <= searchedValue && ! arrayList.contains (list [iii])) {
            sum += list [iii];
            if (sum == sumV) {
                return iii;
            }
            arrayList.add (list [iii]);
        }
    }
    return - 1;
}


public int solution (int X, int [] A) {
    int sum = 0;
    int searchedValue = X;
    int sumV = searchedValue * (searchedValue + 1) / 2;
    Set<Integer> seenNums = new HashSet<Integer>();
    for (int iii = 0;
    iii < A.length; iii ++) {
        if (A[iii] <= searchedValue && ! seenNums.contains (A[iii])) {
            sum += A[iii];
            if (sum == sumV) {
                return iii;
            }
            seenNums.add (A[iii]);
        }
    }
    return - 1;
}
