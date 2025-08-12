public static List < Int32 > LocateSubset (Byte [] superSet, Byte [] subSet) {
    if ((superSet == null) || (subSet == null)) {
        throw new ArgumentNullException ();
    }
    if ((superSet.Length < subSet.Length) || (superSet.Length == 0) || (subSet.Length == 0)) {
        return new List < Int32 > ();
    }
    var result = new List < Int32 > ();
    Int32 currentIndex = 0;
    Int32 maxIndex = superSet.Length - subSet.Length;
    while (currentIndex < maxIndex) {
        Int32 matchCount = CountMatches (superSet, currentIndex, subSet);
        if (matchCount == subSet.Length) {
            result.Add (currentIndex);
        }
        currentIndex ++;
        if (matchCount > 0) {
            currentIndex += matchCount - 1;
        }
    }
    return result;
}


 public static List < int > LocateSubset (Byte[] superSet, Byte[] subSet) 
{ 
    if (superSet == null || subSet == null) 
    { 
        throw new ArgumentNullException (); 
    } 
    if (superSet.Length < subSet.Length || superSet.Length == 0 || subSet.Length == 0) 
    { 
        return new List<int>(); 
    } 
    var result = new List<int>(); 
    int currentIndex = 0; 
    int maxIndex = superSet.Length - subSet.Length; 

    while (currentIndex < maxIndex) 
    { 
        int matchCount = 0; 

        for (int i = 0; i < subSet.Length; i++) 
        { 
            if (subSet[i] == superSet[currentIndex + i]) 
            { 
                matchCount++; 
            } 
        } 
        if (matchCount == subSet.Length) 
        { 
            result.Add(currentIndex); 
        } 
        currentIndex++; 

        if (matchCount > 0) 
        { 
            currentIndex += matchCount - 1; 
        } 
    } 

    return result; 
}


