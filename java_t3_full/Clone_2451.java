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



 

public int solution(int M, int[] A) {
    int goal = M;
    int targetSum = goal*(goal+1)/2;
    int sum = 0;
    Set<Integer> set = new HashSet<>();
    
    for (int i = 0; i < A.length; i++) {
      if (A[i] <= goal && !set.contains(A[i])) {
        sum += A[i];
        if (sum == targetSum)
          return i;
        
        set.add(A[i]);
      }
    }
    return -1;
}


