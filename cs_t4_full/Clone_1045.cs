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
    if (value is string) 
        return (string)value; 
    if (value is IDictionary dictionary) 
        return GetString(dictionary); 
    if (value is IEnumerable enumeration) 
        return GetString(enumeration); 
    else 
        return value.ToString(); 
} 


