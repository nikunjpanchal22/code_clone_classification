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



 

public int solution(int L, int[] D) {
    int[] numArray = D;
    int sumVal = 0;
    int targetSum = L * (L + 1) / 2;
    Set<Integer> numSet = new HashSet<>();
    
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] <= L && !numSet.contains(numArray[i])) {
        sumVal += numArray[i];
        if (sumVal == targetSum)
          return i;
        
        numSet.add(numArray[i]);
      }
    }
    return -1;
}


