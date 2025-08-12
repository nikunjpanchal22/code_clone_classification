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
    boolean[] complete = new boolean[A.length+1];
    int sumExpected = X * (X + 1) / 2;
    int sumActual = 0;
    for(int i = 0; i < A.length; i++) {
        if(!complete[A[i]]) {
            sumActual += A[i];
            complete[A[i]] = true;
        }
        if(sumActual == sumExpected) return i;
    }
    return -1;
}


