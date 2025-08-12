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


 public static object GetPropertyValue(object sourceObject, String prop)
{
	if (sourceObject == null || String.IsNullOrEmpty(prop))
		throw new ArgumentException();
	
	PropertyInfo info = null;
	Type sourceObjectType = sourceObject.GetType();
	
	if (prop.Contains("."))
	{
		String[] props = prop.Split(new char [] { '.' }, 2);
		PropertyInfo[] propArr = sourceObjectType.GetProperties();
		
		foreach (PropertyInfo eachProp in propArr)
		{
			if (eachProp.Name == props[0])
			{
				info = sourceObjectType.GetProperty(props[0]);
				sourceObject = info.GetValue(sourceObject, null);
				sourceObjectType = sourceObject.GetType();
				prop = props[1];
				break;
			}
		}
	}
	
	info = sourceObjectType.GetProperty(prop);
	
	if (info == null) 
		throw new ArgumentException();
		
	return info.GetValue(sourceObject, null);	
}


