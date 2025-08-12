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
	   string str = value as string;
	   if (str != null) return str;
	   
	   IDictionary idict = value as IDictionary;
	   if (idict != null) return GetString (idict);
	  
	   IEnumerable ienum = value as IEnumerable;
	   if (ienum != null) return GetString (ienum);
	   
	   return value.ToString();
}


