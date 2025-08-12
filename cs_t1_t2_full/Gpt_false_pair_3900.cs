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


private static IEnumerable < T [] > ComputeCombinations<T>(IEnumerable < T > values, List < T > currentResult, int startIndex, int threshold) {
    if (currentResult.Count >= threshold) {
        yield break;
    }
    for (int i = startIndex; i < values.Count (); i ++) {
        var item = values.Skip (i).First ();
        currentResult.Add (item);
        yield return currentResult.ToArray ();
        foreach (var combo in ComputeCombinations (values, currentResult, i + 1, threshold)) {
            yield return combo;
        }
        currentResult.RemoveAt (currentResult.Count - 1);
    }
}
