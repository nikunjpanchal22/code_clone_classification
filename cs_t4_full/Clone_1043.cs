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


 public static string GetString(object value) {
    switch(value) {
        case string s:
            return s;
        case IDictionary d:
            return GetString(d);
        case IEnumerable e:
            return GetString(e);
        default:
            return value.ToString();
    }
}


