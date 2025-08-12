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


public static List < Int32 > FindSubset (Byte [] superset, Byte [] subset) {
    if ((superset == null) || (subset == null)) {
        throw new ArgumentNullException ();
    }
    if ((superset.Length < subset.Length) || (superset.Length == 0) || (subset.Length == 0)) {
        return new List < Int32 > ();
    }
    var result = new List < Int32 > ();
    Int32 nowIndex = 0;
    Int32 maxIndex = superset.Length - subset.Length;
    while (nowIndex < maxIndex) {
        Int32 matchNumber = ComputeMatches (superset, nowIndex, subset);
        if (matchNumber == subset.Length) {
            result.Add (nowIndex);
        }
        nowIndex ++;
        if (matchNumber > 0) {
            nowIndex += matchNumber - 1;
        }
    }
    return result;
}
