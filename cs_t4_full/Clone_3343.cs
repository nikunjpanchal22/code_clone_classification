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






public static IEnumerable<T> TakeLast<T>(this IEnumerable<T> source, int count)
{
    var offset = Math.Max(0, source.Count() - count);
    return source.Where((value, i) => i >= offset);
}


