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



 

public int solution(int H, int[] F) {
    int[] elements = F;
    int total = 0;
    int requiredTotal = H * (H + 1) / 2;
    HashSet<Integer> numSet = new HashSet<>();
    
    for (int i = 0; i < elements.length; i++) {
      if (elements[i] <= H && !numSet.contains(elements[i])) {
        total += elements[i];
        if (total == requiredTotal)
          return i;
        
        numSet.add(elements[i]);
      }
    }
    return -1;
}


