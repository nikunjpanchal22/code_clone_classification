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

    if (propName.IndexOf (".") > 0) {
        string [] subProps = propName.Split ('.');
        object currentObj = GetPropertyValue (src, subProps [0]);
        if (subProps.Length > 1)
            return GetPropertyValue (currentObj, string.Join (".", subProps, 1, subProps.Length - 1));
    } else {
        PropertyInfo objPropInfo = src.GetType ().GetProperty (propName);
        if (objPropInfo != null)
            return objPropInfo.GetValue (src, null);
    }

    return null;
}


