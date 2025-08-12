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


 private static IEnumerable<T[]> EnumerateCombos<T>(IEnumerable<T> items, List<T> currentCombo, int startIndex, int threshold)
{
	if (currentCombo.Count >= threshold) 
	{
		yield break;
	}
	for (int i = startIndex; i < items.Count(); i++)
	{
		var item = items.Skip(i).First();
		currentCombo.Add(item);
		yield return currentCombo.Take(threshold).ToArray();
		foreach (var combo in EnumerateCombos(items, currentCombo, i + 1, threshold)) 
		{
			yield return combo;
		}
		currentCombo.RemoveAt(currentCombo.Count - 1);
	}
}
