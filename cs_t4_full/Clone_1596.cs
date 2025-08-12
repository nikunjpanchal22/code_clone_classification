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
    var output = new StringBuilder();
    var size = values.Count();
    var index = 1;

    foreach (T value in values)
    {
        output.Append(value.ToString());

        if (index == size)
            output.Append(sepLast);
        else
            output.Append(separator);

        index++;
    }

    return output.ToString();
}


