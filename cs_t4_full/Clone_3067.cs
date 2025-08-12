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
	    if(value.GetType() == typeof(string)) return (string)value;
	    if(value is IDictionary) return GetString((IDictionary)value);
	    if(value is IEnumerable) return GetString((IEnumerable)value);
	    return value.ToString();
}


