private int CountOccurrences (string TestString, string TestPattern) {
    int PatternCount = 0;
    int SearchIndex = 0;
    if (TestPattern.Length == 0)
        throw new ApplicationException ("CountOccurrences: Unable to process because TestPattern has zero length.");
    if (TestString.Length == 0)
        return 0;
    do
        {
            SearchIndex = TestString.IndexOf (TestPattern, SearchIndex);
            if (SearchIndex >= 0) {
                ++ PatternCount;
                SearchIndex += TestPattern.Length;
            }
        } while ((SearchIndex >= 0) && (SearchIndex < TestString.Length));
    return PatternCount;
}



 

private int CountOccurrences(string TestString, string TestPattern)
{
    int count = 0, n = 0;
    while ((n = TestString.IndexOf(TestPattern, n)) != -1)
    {
        n += TestPattern.Length;
        ++count;
    }
    return count;
}


