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
    int cnt = 1;
    int maxCnt = 0;
    int idxOf = 0;
    int i;
    for (i = 0; i < array1.Length - 1; i ++) {
        if (comparer.Compare (array1 [i], array1 [i + 1]) == 0) {
            cnt ++;
        } else {
            if (maxCnt < cnt) {
                maxCnt = cnt;
                idxOf = i - cnt + 1;
            }
            cnt = 1;
        }
    }
    if (maxCnt < cnt) {
        maxCnt = cnt;
        idxOf = i - cnt + 1;
    }
    return idxOf;
}
