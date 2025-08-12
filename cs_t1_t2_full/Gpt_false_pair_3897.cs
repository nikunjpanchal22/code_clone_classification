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


public static List < Int32 > LocatePartialSet (Byte [] superset, Byte [] partialSet) {
    if ((superset == null) || (partialSet == null)) {
        throw new ArgumentNullException ();
    }
    if ((superset.Length < partialSet.Length) || (superset.Length == 0) || (partialSet.Length == 0)) {
        return new List < Int32 > ();
    }
    var result = new List < Int32 > ();
    Int32 currentPosition = 0;
    Int32 maxPosition = superset.Length - partialSet.Length;
    while (currentPosition < maxPosition) {
        Int32 matchCount = EstimateMatches (superset, currentPosition, partialSet);
        if (matchCount == partialSet.Length) {
            result.Add (currentPosition);
        }
        currentPosition ++;
        if (matchCount > 0) {
            currentPosition += matchCount - 1;
        }
    }
    return result;
}
