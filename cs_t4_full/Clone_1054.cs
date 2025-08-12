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
    string returnString = string.Empty;
    if (value is string)
        returnString = (string)value;
    else if(value is IDictionary dictionary)
        returnString = GetString(dictionary);
    else if(value is IEnumerable enumerable)
        returnString = GetString(enumerable);
    else if(value != null)
        returnString = value.ToString();
    return returnString;
}


