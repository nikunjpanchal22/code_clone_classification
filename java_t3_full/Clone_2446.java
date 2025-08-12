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



 

public int solution(int N, int[] A) {
    int[] arr = A;
    int totalSum = 0;
    int targetN = N;
    int requiredSum = targetN * (targetN + 1) / 2;
    HashSet<Integer> hashSet = new HashSet<>();
    
    for (int index = 0; index < arr.length; index++) {
      if (arr[index] <= targetN && !hashSet.contains(arr[index])) {
        totalSum += arr[index];
        if (totalSum == requiredSum)
          return index;
        
        hashSet.add(arr[index]);
      }
    }
    return -1;
}


