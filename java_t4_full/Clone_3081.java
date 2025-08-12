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
    int[] accessed = new int[X + 1];
    int totalSum = (X * (X + 1)) / 2;
    int sum = 0;
    for (int index = 0; index < A.length; index++) {
        if (A[index] <= X && accessed[A[index]] == 0) {
            accessed[A[index]] = 1;
            sum += A[index];
            if (sum == totalSum)
                return index;
        }
    }
    return -1;
}


