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
    Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    for (int iii = 0; iii < list.length; iii++) {
        if (list[iii] <= searchedValue && !map.containsKey(list[iii])) {
            sum += list[iii];
            if (sum == sumV) {
                return iii;
            }
            map.put(list[iii], true);
        }
    }
    return -1;
}
