public static object GetPropertyValue (object src, string propName) {
    if (src == null)
        throw new ArgumentException ("Value cannot be null.", "src");
    if (propName == null)
        throw new ArgumentException ("Value cannot be null.", "propName");
    if (propName.Contains (".")) {
        var temp = propName.Split (new char [] {'.'}, 2);
        return GetPropertyValue (GetPropertyValue (src, temp [0]), temp [1]);
    } else {
        var prop = src.GetType ().GetProperty (propName);
        return prop != null ? prop.GetValue (src, null) : null;
    }
}


 public static object GetPropertyValue (object src, string propName) {
    if (src == null || propName == null)
        throw new ArgumentException ("Value cannot be null.", "src or propName");

    if (propName.Contains (".")) {
        int index = propName.IndexOf (".");
        string leftToken = propName.Substring (0, index);
        string rightToken = propName.Substring (index + 1);
        return GetPropertyValue (GetPropertyValue (src, leftToken), rightToken);
    } else {
        Type type = src.GetType ();
        PropertyInfo prop = type.GetProperty (propName);
        if (prop != null)
            return prop.GetValue (src, null);
    }
    return null;
}


