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





public int solution(int X, int[] A){
    boolean[] isExist = new boolean[X+1];
    int totalSum = 0;
    int currentSum = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && !isExist[A[i]]) {
            currentSum += A[i];
            isExist[A[i]] = true;
        }
        if (currentSum == totalSum) return i;
    }
    return -1;
}


