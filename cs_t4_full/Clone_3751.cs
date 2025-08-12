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





public static IEnumerable<IEnumerable<T>> GetPermutations<T>(IEnumerable<IEnumerable<T>> sequences)
{
	    var enu1 = sequences.First();
	    var enu2 = sequences.Skip(1);

	    return enu2.Any()
	    ? enu1.SelectMany(item => GetPermutations(enu2), (item, tail) => new T[] { item }.Concat(tail))
	    : enu1.Select(Titem => new T[] { Titem });
}


