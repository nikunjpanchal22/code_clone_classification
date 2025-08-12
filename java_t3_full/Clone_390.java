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
    int targetSum = X * (X + 1) / 2;
    int currentSum = 0;
    HashSet < Integer > found_numbers = new HashSet < Integer >();
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X) {
            if (found_numbers.add(A[i])) {
                currentSum += A[i];
            }
            if (currentSum == targetSum) {
                return i;
            }
        }
    }
    return -1;
}


