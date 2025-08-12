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



 

public int solution(int Y, int[] B) {
    TreeSet<Integer> treeSet = new TreeSet<>();
    
    int sum = 0;
    int targetTotal = Y * (Y+1) / 2;
    
    for (int i = 0; i < B.length; i++) {
      if (!treeSet.contains(B[i]) && B[i] <= Y) {
        sum += B[i];
        if (sum == targetTotal)
          return i;
        
        treeSet.add(B[i]);
      }
    }
    return -1;
}


