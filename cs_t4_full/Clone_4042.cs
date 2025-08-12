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


 public static object GetPropertyValue(object sourceObject, string propName)
{
	if (sourceObject == null)
		throw new ArgumentException("Value cannot be null.", "sourceObject");
	
	if (propName == null)
		throw new ArgumentException("Value cannot be null.", "propName");
	
	if (propName.Contains("."))
	{
		string[] props = propName.Split('.');
		string firstProperty = props[0];
		string secondProperty = props[1];
		
try
		{
			PropertyInfo firstProp = sourceObject.GetType().GetProperty(firstProperty);
			object firstObject = firstProp.GetValue(sourceObject, null);
			sourceObject = firstObject;
			propName = secondProperty;
			return GetPropertyValue(sourceObject, propName);
		}
		catch
		{
			throw new ArgumentException("Value cannot be null.", "propName");
        }
		
	}
	else
	{
		PropertyInfo prop = sourceObject.GetType().GetProperty(propName);
		if (prop != null)
		{
			return prop.GetValue(sourceObject, null);
		}
		else
		{
			return null;
		}
	}
}


