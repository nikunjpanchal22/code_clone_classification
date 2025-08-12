public static IEnumerable < IEnumerable < T > > QuickPerm < T > (this IEnumerable < T > set) {
    int N = set.Count ();
    int [] a = new int [N];
    int [] p = new int [N];
    var yieldRet = new T [N];
    List < T > list = new List < T > (set);
    int i, j, tmp;
    for (i = 0; i < N; i ++) {
        a [i] = i + 1;
        p [i] = 0;
    }
    yield return list;
    i = 1;
    while (i < N) {
        if (p [i] < i) {
            j = i % 2 * p [i];
            tmp = a [j];
            a [j] = a [i];
            a [i] = tmp;
            for (int x = 0; x < N; x ++) {
                yieldRet [x] = list [a [x] - 1];
            }
            yield return yieldRet;
            p [i] ++;
            i = 1;
        } else {
            p [i] = 0;
            i ++;
        }
    }
}


public static IEnumerable < IEnumerable < T > > QuickPerm < T > (this IEnumerable < T > set) {
    int N = set.Count ();
    int [] a = new int [N];
    int [] p = new int [N];
    var yieldRet = new T [N];
    List < T > list = new List < T > (set);
    int i, j, tmp;
    for (i = 0; i < N; i ++) {
        a [i] = i + 1;
        p [i] = 0;
    }
    yield return list;
    i = 1;
    while (i < N) {
        j = i % 2 * p [i];
        tmp = a [j];
        a [j] = a [i];
        a [i] = tmp;
        for (int x = 0; x < N; x ++) {
            yieldRet [x] = list [a [x] - 1];
        }
        yield return yieldRet;
        p [i] ++;
        i = 1;
    }
}
