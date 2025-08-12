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
    var enumerator = values.GetEnumerator(); 
    var result = new StringBuilder(); 

    // Append the first item 
    if(enumerator.MoveNext()) 
    { 
        result.Append(enumerator.Current); 
    } 

    object obj = null; 

    // Append the second item 
    if(enumerator.MoveNext()) 
    { 
        obj = enumerator.Current; 
    } 

    // Append the remaining items 
    while(enumerator.MoveNext()) 
    { 
        result.Append(separator).Append(obj); 
        obj = enumerator.Current; 
    } 

    if(obj != null) 
    { 
        result.Append(sepLast).Append(obj); 
    } 

    return result.ToString(); 
} 


