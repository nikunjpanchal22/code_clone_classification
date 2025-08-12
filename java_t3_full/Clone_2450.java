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



 

public int solution(int Z, int[] C) {
    int[] arrC = C;
    int total = 0;
    int requiredTotal = Z * (Z + 1) / 2;
    Set<Integer> numSet = new HashSet<>();
    
    for (int i = 0; i < arrC.length; i++) {
      if (arrC[i] <= Z && !numSet.contains(arrC[i])) {
        total += arrC[i];
        if (total == requiredTotal)
          return i;
        
        numSet.add(arrC[i]);
      }
    }
    return -1;
}


