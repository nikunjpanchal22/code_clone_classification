public static IEnumerable < IEnumerable < T > > GetPermutations < T > (IEnumerable < IEnumerable < T > > lists) {
    if (! lists.Any ()) {
        yield break;
    }
    List < IEnumerator < T > > iterators = new List < IEnumerator < T > > ();
    foreach (var list in lists) {
        var it = list.GetEnumerator ();
        if (! it.MoveNext ()) {
            continue;
        }
        iterators.Add (it);
    }
    bool done = false;
    while (! done) {
        yield return from it in iterators
            select it.Current;
        bool recurse = false;
        var mainIt = iterators.GetEnumerator ();
        mainIt.MoveNext ();
        do
            {
                recurse = false;
                var subIt = mainIt.Current;
                if (! subIt.MoveNext ()) {
                    subIt.Reset ();
                    subIt.MoveNext ();
                    if (! mainIt.MoveNext ()) {
                        done = true;
                    } else {
                        recurse = true;
                    }
                }
            } while (recurse);
    }
}


 public static IEnumerable < IEnumerable < T > > GetPermutations < T > (IEnumerable < IEnumerable < T > > lists) {
    if (!lists.Any()) {
        yield break;
    }
    List<IEnumerator<T>> iterators = new List<IEnumerator<T>>();
    foreach (var list in lists) {
        var it = list.GetEnumerator();
        if (!it.MoveNext()) {
            continue;
        }
        iterators.Add(it);
    }
    
    bool done = false;
    while (!done) {
        List<T> currentPermutation = new List<T>(iterators.Count);
        foreach (var it in iterators) {
            currentPermutation.Add(it.Current);
        }  
        yield return currentPermutation;

        bool checkAll = false;
        var mainIt = iterators.GetEnumerator();
        mainIt.MoveNext();
        do {
            checkAll = false;
            var subIt = mainIt.Current;
            if (!subIt.MoveNext()) {
                subIt.Reset();
                subIt.MoveNext();
                if (!mainIt.MoveNext()) {
                    done = true;
                } else {
                    checkAll = true;
                }
            } 
        } while (checkAll);
    }

}
