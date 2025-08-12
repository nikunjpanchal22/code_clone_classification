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



 

public int solution(int K, int[] C) {
    int [] array = C;
    int sum = 0;
    int target = K * (K + 1) / 2;
    Set<Integer> set = new LinkedHashSet<>();
    for (int i = 0; i < array.length; i++) {
        if (!set.contains(array[i]) && array[i] <= K) {
            sum += array[i];
            if (sum == target)
                return i;
            set.add(array[i]);
        }
    }
    return -1;
}


