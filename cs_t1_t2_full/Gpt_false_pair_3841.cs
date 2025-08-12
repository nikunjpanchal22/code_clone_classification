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
    } else if (value is ICollection) {
        return GetString (value as ICollection);
    } else if (value is IEnumerable) {
        return GetString (value as IEnumerable);
    } else {
        return value.ToString ();
    }
}
