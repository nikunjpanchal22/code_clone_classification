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


 public static List<Int32> FindSubsets(Byte[] superSet, Byte[] subSet) 
{ 
    if (superSet == null || subSet == null) 
    { 
        throw new ArgumentNullException(); 
    } 
    if (superSet.Length < subSet.Length || superSet.Length == 0 || subSet.Length == 0) 
    { 
        return new List<Int32>(); 
    } 

    List<Int32> indices = new List<Int32>(); 
    int maxIndex = superSet.Length - subSet.Length; 
    for (int currentIndex = 0; currentIndex < maxIndex; currentIndex++) 
    { 
        if (MatchingSubsets(currentIndex, superSet, subSet)) 
        { 
            indices.Add(currentIndex); 
            if (MaxMatches(superSet, currentIndex, subSet) > 0) 
            { 
                currentIndex += MaxMatches(superSet, currentIndex, subSet) - 1; 
            } 
        } 
    } 

    return indices; 
} 


