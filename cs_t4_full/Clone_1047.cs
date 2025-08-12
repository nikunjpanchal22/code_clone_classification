public static String GetString (object value) {
    if (value is string) {
        return value as string;
    } else if (value is IDictionary) {
        return GetString (value as IDictionary);
    } else if (value is IEnumerable) {
        return GetString (value as IEnumerable);
    } else {
        return value.ToString ();
    }
}


 public static string GetString(object value) 
{ 
    if (value is string x) 
        return x; 
    if (value is IDictionary v) 
        return GetString(v); 
    if (value is IEnumerable t) 
        return GetString(t); 
    return value.ToString(); 
} 


