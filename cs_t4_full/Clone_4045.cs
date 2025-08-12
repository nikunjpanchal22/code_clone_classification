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


 public static object GetPropertyValue(object sourceObject, String propName)
{
    if (sourceObject == null)
    {
        throw new ArgumentException("Value cannot be null.", "sourceObject");
    }
    if (propName == null) 
    {
        throw new ArgumentException("Value cannot be null.", "propName");
    }
    if (propName.Contains(".")) 
    {
        String[] props = propName.Split('.');
        String firstProperty = props[0];
        String secondProperty = props[1];
        object firstObject = sourceObject.GetType().GetProperty(firstProperty).GetValue(sourceObject, null);
        sourceObject = firstObject;
        propName = secondProperty;
        return GetPropertyValue(sourceObject, propName);
    } 
    else 
    {
        PropertyInfo prop = sourceObject.GetType().GetProperty(propName);
        return prop != null ? prop.GetValue(sourceObject, null) : null;
    }
}


