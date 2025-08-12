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



 

public int solution(int R, int[] B) {
    int[] array = B;
    int sum = 0;
    int targetSum = R * (R + 1) / 2;
    Set<Integer> numSet = new HashSet<>();
    
    for (int idx = 0; idx < array.length; idx++) {
      if (array[idx] <= R && !numSet.contains(array[idx])) {
        sum += array[idx];
        if (sum == targetSum)
          return idx;
        
        numSet.add(array[idx]);
      }
    }
    return -1;
}


