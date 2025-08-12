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
    string str;
    if (value == null) str = string.Empty;
    else if ((str = value as string) != null) ;
    else if (value is IDictionary) str = GetString((IDictionary)value);
    else if (value is IEnumerable) str = GetString((IEnumerable)value);
    else str = value.ToString();
    return str;
}


