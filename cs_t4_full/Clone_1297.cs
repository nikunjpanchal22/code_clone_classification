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

              int j = 0;

              T[] currentGroup = new T[size];

              foreach (T item in source)

              {

                currentGroup[j] = item;

                if (++j % size == 0)

                {

                  largeGroup.Add(currentGroup);

                  currentGroup = new T[size];

                }

              }

              if (currentGroup.Length == size)

                largeGroup.Add(currentGroup);

                

              return largeGroup;

}


