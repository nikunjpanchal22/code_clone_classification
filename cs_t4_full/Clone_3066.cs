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
	    if(value is string s) return s;
	    else if(value is IDictionary dict) return GetString(dict);
	    else if(value is IEnumerable en) return GetString(en);
	    return value.ToString();
}


