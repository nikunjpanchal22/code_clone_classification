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

    PropertyInfo propertyInfo;
    object value = src;

    string [] components = propName.Split('.');
    foreach (string c in components) {
        propertyInfo = value.GetType().GetProperty(c);
        if (propertyInfo == null)
            return null;
        value = propertyInfo.GetValue(value, null);
    }
    return value;
}


