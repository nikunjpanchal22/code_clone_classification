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
        string [] components = propName.Split ('.');
        object value = src;
        foreach (var c in components) {
            var objPropInfo = value.GetType ().GetProperty (c);
            if (objPropInfo == null)
                return null;
            value = objPropInfo.GetValue (value, null);
        }
        return value;
    } else {
        var objPropInfo = src.GetType ().GetProperty (propName);
        return objPropInfo != null ? objPropInfo.GetValue (src, null) : null;
    }
}


