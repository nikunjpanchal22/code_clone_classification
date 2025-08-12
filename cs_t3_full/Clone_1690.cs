private static IEnumerable < IEnumerable < T > > ClumpIterator < T > (IEnumerable < T > source, int size) {
    Debug.Assert (source != null, "source is null.");
    T [] items = new T [size];
    int count = 0;
    foreach (var item in source) {
        items [count] = item;
        count ++;
        if (count == size) {
            yield return items;
            items = new T [size];
            count = 0;
        }
    }
    if (count > 0) {
        if (count == size)
            yield return items;
        else {
            T [] tempItems = new T [count];
            Array.Copy (items, tempItems, count);
            yield return tempItems;
        }
    }
}


	private static IEnumerable < IEnumerable < T >> SplitIntoGroupsIterator < T > (IEnumerable < T > source, int size) {
	T [] items = new T [size];
	int count = 0;
	foreach (var item in source) {
		items[count] = item;
		count++;
		if (count == size) {
			yield return items;
			// Move current items to new array of new size
			var clonearray = new T[count];
			Array.Copy(items, clonearray, size);
			yield return clonearray;
			// Create new empty array
			items = new T[size];
			count = 0;
		}
	}
	// If the last batch is NOT full, no need to apply Array.Copy anymore
	if (count > 0) 
		yield return items;
}


