public static T [] Slice < T > (this T [] arr, int offset, int length) {
    int start, end;
    if (offset < 0)
        start = arr.Length + offset;
    else
        start = offset;
    if (start < 0)
        start = 0;
    else if (start > arr.Length)
        start = arr.Length;
    if (length < 0)
        end = arr.Length + length;
    else
        end = start + length;
    if (end < 0)
        end = 0;
    if (end > arr.Length)
        end = arr.Length;
    int len = end - start;
    T [] result = new T [len];
    for (int i = 0; i < len; i ++) {
        result [i] = arr [start + i];
    }
    return result;
}


 public static T [] Slice < T > (this T [] arr, int offset, int length) {
    int start, end;
    start = Math.Max(Math.Min(offset, arr.Length - 1), 0);
    end = Math.Min(start + Math.Max(length, 0), arr.Length);
    if(end <= start)
        return new T[] {};
    T [] result = new T [end - start];
    System.Array.Copy(arr, start, result, 0, end - start);
    return result;
}


