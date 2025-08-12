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
    if (! lists.Any ()) {
        yield break;
    } 
    
    var totalCount = lists.Select(e => e.Count()).Sum();
    for (var jCount = 0; jCount < totalCount; jCount++)
    {
        List<T> currentPermutation = new List<T>();
        foreach (var list in lists)
        {
            currentPermutation.Add(list.ElementAt(jCount % list.Count()));
        }

        yield return currentPermutation;
    }
}


