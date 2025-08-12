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
    if (!lists.Any())
    {
        yield break;
    }
    
    List<IEnumerator<T>> enumerators = new List<IEnumerator<T>>();
    foreach (var list in lists)
    {
        var it = list.GetEnumerator();
        if (!it.MoveNext())
        {
            continue;
        }
        enumerators.Add(it);
    }

    bool done = false;
    while (!done)
    {
        List<T> block = new List<T>(enumerators.Count);
        for (int i = 0; i < enumerators.Count; i++)
        {
            block[i] = enumerators[i].Current;
        }
        yield return block;

        bool checkAll = false;
        while (!checkAll)
        {
            checkAll = true;
            for (int i = 0; i < enumerators.Count; i++)
            {
                if (enumerators[i].MoveNext())
                {
                    checkAll = false;
                    break;
                }
                else
                {
                    enumerators[i].Reset();
                    enumerators[i].MoveNext();
                }
            }
            if (checkAll)
                done = true;
        }
    }
}


