static IEnumerable < IEnumerable < T > > Partition < T > (this IEnumerable < T > source, int size) {
    int count = 0;
    T [] group = null;
    foreach (T item in source) {
        if (group == null)
            group = new T [size];
        group [count ++] = item;
        if (count == size) {
            yield return group;
            group = null;
            count = 0;
        }
    }
    if (count > 0) {
        Array.Resize (ref group, count);
        yield return group;
    }
}



static IEnumerable < IEnumerable < T > > Partition < T > (this IEnumerable < T > source, int chunkSize) {
    int count = 0;
    T [] segment = null;
    foreach (T element in source) {
        if (segment == null)
            segment = new T [chunkSize];
        segment [count ++] = element;
        if (count == chunkSize) {
            yield return segment;
            segment = null;
            count = 0;
        }
    }
    if (count > 0) {
        Array.Resize (ref segment, count);
        yield return segment;
    }
}
