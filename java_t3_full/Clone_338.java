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
        int searchedValue = X; 
        int sumV = searchedValue * (searchedValue + 1) / 2; 
        int sum = 0; 
        List < String > linkedList = new LinkedList < String > (); 
        int res = 0; 
        for (int iii = 0; iii < A.length; iii ++) { 
            if (A [iii] <= searchedValue) { 
                if (! linkedList.contains (String.valueOf (A [iii]))) { 
                    sum += A [iii]; 
                    if (sum == sumV) { 
                        res = iii; 
                        break; 
                    } 
                    linkedList.add (String.valueOf (A [iii])); 
                } 
            } 
        } 
        return res;
}


