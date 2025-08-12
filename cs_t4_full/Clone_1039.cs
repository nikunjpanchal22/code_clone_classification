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


 public static string GetString (object value) 
{ 
    if (value == null) 
        return null; 
    else 
    { 
        switch (value) 
        { 
            case string str: 
                return str; 
            case IDictionary dict: 
                return GetString(dict); 
            case IEnumerable e2: 
                return GetString(e2); 
            default: 
                return value.ToString(); 
        } 
    } 
}


