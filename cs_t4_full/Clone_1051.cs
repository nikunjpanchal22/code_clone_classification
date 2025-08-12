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
    string str = string.Empty;
    if (value is string vString)
        str = vString;
    else if (value is IDictionary vDictionary)
        str = GetString(vDictionary);
    else if (value is IEnumerable vEnumerable)
        str = GetString(vEnumerable);
    else if (value != null)
        str = value.ToString();

    return str;
}


