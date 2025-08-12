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

    string [] sections = propName.Split('.');
    if (sections.Length > 1)
    {
        PropertyInfo property = src.GetType().GetProperty(sections[0]);
        string remainingPath = String.Join(".", sections, 1, sections.Length - 1);
        return GetPropertyValue(property.GetValue(src, null), remainingPath);
    } 
    else 
    {
        PropertyInfo objPropInfo = src.GetType().GetProperty(propName);
        return objPropInfo != null ? objPropInfo.GetValue(src, null) : null;
    }

}


