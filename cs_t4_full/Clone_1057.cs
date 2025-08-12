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


 public static String GetString(object value)
{
    if (value == null)
        return string.Empty;
    if (value is string str)
        return str;
    if (value is IDictionary dict)
        return GetString(dict);
    if (value is IEnumerable list)
        return GetString(list);
    return value.ToString();
}


