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
    string delimiter = ""; 
    string result = string.Empty; 
    int size = 0; 
    string temp; 

    foreach (T t in values) 
    { 
        if (size == values.Count() - 2) 
            delimiter = sepLast; 
        else 
            delimiter = separator; 
        temp = t.ToString() + delimiter; 
        result += temp; 
        size++; 
    } 
    return result; 
}


