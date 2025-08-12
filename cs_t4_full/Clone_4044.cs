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


 public static object GetPropertyValue(object src, string propName)
{
    if(src == null)
        throw new ArgumentException("Value cannot be null.", "src");

    if(propName == null)
        throw new ArgumentException("Value cannot be null", "propName");

    if(propName.Contains("."))
    {
        string[] props = propName.Split(new char[]{'.'},2);
        object firstObject = src.GetType().GetProperty(props[0]).GetValue(src, null);
        src = firstObject;
        propName = props[1];
        return GetPropertyValue(src, propName);
    }
    else
    {
        PropertyInfo prop = src.GetType().GetProperty(propName);
        if (prop != null)
            return prop.GetValue(src, null);
        else
            return null;
    }
}


