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

    IEnumerable<int> listCounts = lists.Select(list => list.Count());
    // Number of permutations = product of all list lengths 
    long permutationsCount = listCounts.Aggregate<int, long>(1, (p, c) => p * c);

    // Calculate permutations for given set
    for (long permIndex = 0; permIndex < permutationsCount; permIndex++)
    {
        // Build permutation from indices 
        List<T> currentPermutation = new List<T>();
        for (int listIndex = 0; listIndex < lists.Count(); listIndex++)
        {
            int elementIndex = (int)(permIndex % listCounts.ElementAt(listIndex));
            double elementDouble = lists.ElementAt(listIndex).ElementAt(elementIndex);
            T element = (T)Convert.ChangeType(elementDouble, typeof(T));
            currentPermutation.Add(element);
            permIndex = permIndex / listCounts.ElementAt(listIndex);
        }
        // Return permutation
        yield return currentPermutation;
    }
}


