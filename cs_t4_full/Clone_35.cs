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


private static object GetProperty (object src, string propName) {
    PropertyInfo objPropInfo = src.GetType ().GetProperty (propName);
    if (objPropInfo == null)
        return null;
    return objPropInfo.GetValue (src, null);
}


