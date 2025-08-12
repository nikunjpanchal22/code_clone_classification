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
    string returnStr = string.Empty;
   
    if (value != null) {
        if (value is string) {
            returnStr = (string)value;
        } else if (value is IDictionary) {
            returnStr = GetString((IDictionary)value);
        } else if (value is IEnumerable) {
            returnStr = GetString((IEnumerable)value);
        } else {
            returnStr = value.ToString();
        }
    }
   
    return returnStr;
}


