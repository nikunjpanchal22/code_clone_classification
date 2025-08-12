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
    int sumExpected = (X*(X+1))/2;
    int[] reached = new int[X+1];
    int index = 0;
    int sumReached = 0;
    while (index < A.length && sumReached<sumExpected){
        if (A[index] <= X && reached[A[index]] == 0){
            sumReached += A[index];
            reached[A[index]] = 1;
        }
        index++;
    }
    return sumReached == sumExpected ? index-1 : -1;
}


