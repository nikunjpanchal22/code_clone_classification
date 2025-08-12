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
    int sum = 0;
    int searchedValue = X;
    for(int i = 0; i <= searchedValue; i++) {
        boolean found = false;
        for(int a : A) {
            if (i == a) {
                found = true;
                break;
            }
        }  
        if (found) {
            sum += i;   
        }
    }
    if (sum == searchedValue * (searchedValue + 1) / 2) {
        for(int iii = 0; iii < A.length; iii++) {
            if(A[iii] == searchedValue) {
                return iii;
            }
        }
    }
    return -1;
}


