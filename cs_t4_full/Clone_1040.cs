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


 public static string GetString (object value) {
    string result = null;
    if (value == null) {
        return result;
    }
    if (value is string) {
        result= value as string;
    } else if (value is IDictionary) {
        result = GetString (value as IDictionary);
    } else if (value is IEnumerable) {
        result = GetString (value as IEnumerable);
    } else {
        result= value.ToString ();
    }
    return result;  
}


