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



static IEnumerable < IEnumerable < T > > Partition < T > (this IEnumerable < T > collection, int chunkSize) {
    int count = 0;
    T [] portion = null;
    foreach (T item in collection) {
        if (portion == null)
            portion = new T [chunkSize];
        portion [count ++] = item;
        if (count == chunkSize) {
            yield return portion;
            portion = null;
            count = 0;
        }
    }
    if (count > 0) {
        Array.Resize (ref portion, count);
        yield return portion;
    }
}
