public static string JoinAnd < T > (string separator, string sepLast, IEnumerable < T > values) {
    var sb = new StringBuilder ();
    var enumerator = values.GetEnumerator ();
    if (enumerator.MoveNext ()) {
        sb.Append (enumerator.Current);
    }
    object obj = null;
    if (enumerator.MoveNext ()) {
        obj = enumerator.Current;
    }
    while (enumerator.MoveNext ()) {
        sb.Append (separator);
        sb.Append (obj);
        obj = enumerator.Current;
    }
    if (obj != null) {
        sb.Append (sepLast);
        sb.Append (obj);
    }
    return sb.ToString ();
}



public static string JoinAnd<T>(string separator, string sepLast, IEnumerable<T> values)
{
    var valueArray = values.ToArray();
    var joined = string.Join(separator, valueArray, 0, valueArray.Length - 1);
    return valueArray.Length > 0 ? $"{joined}{sepLast}{valueArray[^1]}" : joined;
}


