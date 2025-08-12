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






public int solution(int X, int[] A) {
    int reachedSum = 0;
    int[] reachedArray = new int[X];
    int requiredSum = (X * (X + 1)) / 2;
    for (int i=0; i<A.length; i++) {
        if(A[i] <= X && reachedArray[A[i] - 1] == 0) {
            reachedArray[A[i] - 1] = A[i];
            reachedSum += A[i];
            if(requiredSum == reachedSum) {
                return i;
            }
        }
    }
    return -1;
}


