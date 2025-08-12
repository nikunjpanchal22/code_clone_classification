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
    int result = -1, sum = 0;
    int[] check = new int[X];
    for(int index = 0; index < A.length; index++) {
        if(A[index]<=X && check[A[index]-1]==0) {
            sum += A[index];
            check[A[index]-1]++;
        }
        if(sum == (X*(X + 1) / 2)) {
            return index;
        }
    }
    return result;
}


