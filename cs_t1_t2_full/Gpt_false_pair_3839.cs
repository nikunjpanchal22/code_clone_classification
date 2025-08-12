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


public static String GetString (object value) {
    if (value is string) {
        return value as string;
    } else if (value is IDictionary) {
        return GetStringMap (value as IDictionary);
    } else if (value is IEnumerable) {
        return GetStringList (value as IEnumerable);
    } else {
        return value.ToString ();
    }
}
