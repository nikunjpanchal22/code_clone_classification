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





public static IEnumerable<IEnumerable<T>> GetPermutations<T>(IEnumerable<IEnumerable<T>> lists)
        
	{
	    IEnumerator<IEnumerable<T>> L = lists.GetEnumerator();
	    if (!L.MoveNext()) yield break;
	    IEnumerable<T> first = L.Current;
	    if (!L.MoveNext()) {
		foreach (T t in first)
		    yield return new T[] { t };
	    }
	    else {
		IEnumerable<IEnumerable<T>> tail = lists.Skip(1);
		foreach (T t in first)
		    foreach (IEnumerable<T> ts in GetPermutations(tail))
		        yield return new[] { t }.Concat(ts);
	    }
}


