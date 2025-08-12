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


public int solution (int aX, int [] aA) { 
    int vList [] = aA; 
    int vSum = 0; 
    int vX = aX; 
    int vSumV = vX * (vX + 1) / 2; 
    List < Integer > vArrayList = new ArrayList < Integer > (); 
    for (int vIii = 0; vIii < vList.length; vIii ++) { 
        if (vList [vIii] <= vX && ! vArrayList.contains (vList [vIii])) {
            vSum += vList [vIii]; 
            if (vSum == vSumV) {
                return vIii; 
            }
            vArrayList.add (vList [vIii]); 
        } 
    } 
    return -1; 
}
