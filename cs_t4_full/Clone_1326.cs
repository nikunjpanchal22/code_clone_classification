public static IEnumerable < T > TakeLast < T > (this IEnumerable < T > input, int count) {
    if (count <= 0)
        yield break;
    var inputList = input as IList < T >;
    if (inputList != null) {
        int last = inputList.Count;
        int first = last - count;
        if (first < 0)
            first = 0;
        for (int i = first; i < last; i ++)
            yield return inputList [i];
    } else {
        T [] buffer = new T [count];
        int index = 0;
        count = 0;
        foreach (T item in input) {
            buffer [index] = item;
            index = (index + 1) % buffer.Length;
            count ++;
        }
        if (count < buffer.Length)
            index = 0;
        else
            count = buffer.Length;
        while (count > 0) {
            yield return buffer [index];
            index = (index + 1) % buffer.Length;
            count --;
        }
    }
}


 public static IEnumerable<T> TakeLast<T>(this IEnumerable<T> input, int count)
    {
        if (count <= 0)
            yield break;

        int index = 0;
        T[]buffer = new T[count];
        foreach (T item in input)
        {
            buffer[index] = item;
            index = (index + 1) % buffer.Length;
        }
        for (int i = 0; i < count; i++)
        {
            yield return buffer[i];
        }
    }

 public static IEnumerable<T> TakeLast<T>(this IEnumerable<T> input, int count)
{
    if (count <= 0)
        yield break;

    List<T> list = new List<T>();
    foreach (T item in input)
        list.Add(item);

    int startIndex = list.Count - count;
    if (startIndex < 0)
        startIndex = 0;

    while (startIndex < list.Count)
        yield return list[startIndex++];
}


