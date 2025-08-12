private static int IndexOfLongestRun (string str) {
    char [] array1 = str.ToCharArray ();
    Comparer comparer = new Comparer ();
    int counter = 1;
    int maxCount = 0;
    int idenxOf = 0;
    int i;
    for (i = 0; i < array1.Length - 1; i ++) {
        if (comparer.Compare (array1 [i], array1 [i + 1]) == 0) {
            counter ++;
        } else {
            if (maxCount < counter) {
                maxCount = counter;
                idenxOf = i - counter + 1;
            }
            counter = 1;
        }
    }
    if (maxCount < counter) {
        maxCount = counter;
        idenxOf = i - counter + 1;
    }
    return idenxOf;
}


private static int IndexOfLongestRun (string str) {
    char [] array1 = str.ToCharArray ();
    Comparer comparer = new Comparer ();
    int count = 1;
    int max = 0;
    int result = 0;
    int i;
    for (i = 0; i < array1.Length - 1; i ++) {
        if (comparer.Compare (array1 [i], array1 [i + 1]) == 0) {
            count ++;
        } else {
            if (max < count) {
                max = count;
                result = i - count + 1;
            }
            count = 1;
        }
    }
    if (max < count) {
        max = count;
        result = i - count + 1;
    }
    return result;
}
