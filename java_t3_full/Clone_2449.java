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



 

public int solution(int Q, int[] P) {
    int[] arrP = P;
    int total = 0;
    int requiredTotal = Q * (Q + 1) / 2;
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    
    for (int i = 0; i < arrP.length; i++) {
      if (arrP[i] <= Q && !linkedHashSet.contains(arrP[i])) {
        total += arrP[i];
        if (total == requiredTotal)
          return i;
      
        linkedHashSet.add(arrP[i]);
      }
    }
    return -1;
}


