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


public static List < Int32 > IdentifySubset (Byte [] superByte, Byte [] subByte) {
    if ((superByte == null) || (subByte == null)) {
        throw new ArgumentNullException ();
    }
    if ((superByte.Length < subByte.Length) || (superByte.Length == 0) || (subByte.Length == 0)) {
        return new List < Int32 > ();
    }
    var result = new List < Int32 > ();
    Int32 currentLocation = 0;
    Int32 maximumIndex = superByte.Length - subByte.Length;
    while (currentLocation < maximumIndex) {
        Int32 matchCount = CountMatches (superByte, currentLocation, subByte);
        if (matchCount == subByte.Length) {
            result.Add (currentLocation);
        }
        currentLocation ++;
        if (matchCount > 0) {
            currentLocation += matchCount - 1;
        }
    }
    return result;
}
