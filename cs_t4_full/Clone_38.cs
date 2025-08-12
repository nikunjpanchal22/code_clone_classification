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

    string [] tokens = propName.Split ('.');
    PropertyInfo currentProperty = null;
    object currentObject = src;
    foreach (string token in tokens) {
        currentProperty = currentObject.GetType ().GetProperty (token);
        if (currentProperty == null)
            return null;
        currentObject = currentProperty.GetValue (currentObject, null);
    }
    return currentObject;
}


