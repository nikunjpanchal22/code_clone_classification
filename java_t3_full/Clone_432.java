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



public int solution (int X, int [] A) {
    int list [] = A;
    int searchedValue = X;
    int sumV = searchedValue * (searchedValue + 1) / 2;
    int sum = 0;
    TreeSet < Integer > valuesUsedSet = new TreeSet < Integer > ();
    for (int iii = 0;
    iii < list.length; iii ++) {
        if (list [iii] <= searchedValue) {
            int value = list [iii];
            if (! valuesUsedSet.contains (value)) {
                sum += value;
                if (sum == sumV) {
                    return iii;
                }
                valuesUsedSet.add (value);
            }
        }
    }
    return - 1;
}


