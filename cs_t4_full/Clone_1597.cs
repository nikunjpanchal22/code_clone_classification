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
    string joinedString = "";
    string delimiter = separator;
    bool isLast = false;

    foreach (T value in values)
    {
        if (!isLast)
        {
            int count = values.Count();
            isLast = count - 1 == 0 ? true : false;
            delimiter = isLast ? sepLast : separator;
        }
        joinedString += string.Concat(value.ToString(), delimiter);
    }

    return joinedString;
}


