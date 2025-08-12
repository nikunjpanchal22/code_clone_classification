private static IEnumerable < T [] > EnumerateCombos < T > (IEnumerable < T > items, List < T > currentCombo, int startIndex, int threshold) {
    if (currentCombo.Count >= threshold) {
        yield break;
    }
    for (int i = startIndex; i < items.Count (); i ++) {
        var item = items.Skip (i).First ();
        currentCombo.Add (item);
        yield return currentCombo.ToArray ();
        foreach (var combo in EnumerateCombos (items, currentCombo, i + 1, threshold)) {
            yield return combo;
        }
        currentCombo.RemoveAt (currentCombo.Count - 1);
    }
}


 private static IEnumerable < T [] > EnumerateCombos < T > (IEnumerable < T > items, List < T > currentCombo, int startIndex, int threshold) {
    List<T[]> combos = new List<T[]>();
    if (currentCombo.Count >= threshold) {
        return combos;
    }
    for (int i = startIndex; i < items.Count (); i ++) {
        var item = items.ElementAtOrDefault(i); 
        currentCombo.Add (item);
        combos.Add(currentCombo.ToArray());
        IEnumerable<T[]> moreCombos = EnumerateCombos (items, currentCombo, i + 1, threshold);
        if(moreCombos != null)
        {
            foreach (T[] t in moreCombos) 
            { 
                combos.Add(t); 
            } 
        }
        currentCombo.RemoveAt (currentCombo.Count - 1);
    }
    return combos;
}


