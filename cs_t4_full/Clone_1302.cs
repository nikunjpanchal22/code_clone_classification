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


 static IEnumerable<IEnumerable<T>> Partition<T>(this IEnumerable<T> source, int size)

            {

              List<T[]> largeGroup = new List<T[]>();

              int count = 0;

              for (int i = 0; i < source.Count(); i+=size)

              {

                T[] tempGroup = source.Skip(i).Take(size).ToArray();

                largeGroup.Add(tempGroup);

              }

              return largeGroup;

}


