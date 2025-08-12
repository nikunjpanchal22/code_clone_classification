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


	private static IEnumerable<IEnumerable<T>> SegmentIterator<T>(IEnumerable<T> source, int size) {
    List<T> items = new List<T>();
    int count = 0;
    foreach (T item in source) {
        items.Add(item);
        count++;
        if (count == size) {
            yield return items;
            items = new List<T>();
            count = 0;
        }
    }
    if (count > 0) {
        if (count == size)
            yield return items;
        else {
            var tempItems = items.GetRange(0, count);
            yield return tempItems;
        }
    }
}


