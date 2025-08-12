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

              T[] group = new T[size];

              foreach (var item in source)

              {

                group[count++] = item;

                if (count == size)

                {

                  largeGroup.Add(group);

                  group = new T[size];

                  count = 0;

                }

              }

              if (count > 0)

              {

                Array.Resize(ref group, count);

                largeGroup.Add(group);

              }

              return largeGroup;

}


