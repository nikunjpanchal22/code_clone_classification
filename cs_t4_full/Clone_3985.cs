public static bool HasPropertyExist (dynamic settings, string name) {
    if (settings is System.Dynamic.ExpandoObject)
        return ((IDictionary < string, object >) settings).ContainsKey (name);
    if (settings is System.Web.Helpers.DynamicJsonObject)
        try {
            return settings [name] != null;
        }
        catch (KeyNotFoundException) {
            return false;
        }
    return settings.GetType ().GetProperty (name) != null;
}



public static bool HasPropertyExist(dynamic settings, string name) {
	    if (!(settings is ExpandoObject eo || 
		  settings is DynamicJsonObject djo || 
		  settings.GetType().GetProperty(name) != null)) return false;
	    
	    return eo?.ContainsKey(name) ?? djo?.ContainsKey(name) ?? true;
}


