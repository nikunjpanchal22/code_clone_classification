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
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < list.length; i++) {
        if (list[i] <= searchedValue) {
            if (!set.contains (list[i])) {
                sum += list[i];
                if (sum == sumV) {
                    return i;
                }
                set.add (list[i]);
            }
        }
    }
    return -1;
}
