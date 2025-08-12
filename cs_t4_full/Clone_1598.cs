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


 public static string JoinAnd<T> (string separator, string sepLast, IEnumerable<T> values)
{
    var output = new StringBuilder();
    var currentSep = separator;
    int i = 0;

    foreach (T value in values) 
    {
        if (i == values.Count() - 1) 
        {
            currentSep = sepLast;
        }
        output.Append(value.ToString());
        output.Append(currentSep);
        i++;
    }
    return output.ToString(0, output.Length - 1);
}


