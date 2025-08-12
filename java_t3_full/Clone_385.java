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


 public int solution(int X, int[] A) {
    int list[] = A;
    int sum = 0;
    int searchedValue = X;
    int sumV = searchedValue * (searchedValue + 1) / 2;
    
    int i = 0;
    HashSet<Integer> hashSet = new HashSet<>();
    while (i < list.length) {
        if (list[i] <= searchedValue && !hashSet.contains (list[i])) {
            hashSet.add (list[i]);
            sum += list[i];
            if (sum == sumV) {
                return i;
            }
        }
        i++;
    }
    return -1;
}


