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

              List<List<T>> largeGroup = new List<List<T>>();

              int count = 0;

              List<T> group = new List<T>();

              foreach (var item in source)

              {

                group.Add(item);

                if (++count % size == 0)

                {

                  largeGroup.Add(group);

                  group = new List<T>();

                }

              }

              largeGroup.Add(group);

              

              return largeGroup.Select(x => x.ToArray());

}


