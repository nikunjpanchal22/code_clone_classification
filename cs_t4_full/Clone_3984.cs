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
	    IDictionary<string, object> expando;
	    DynamicJsonObject djo;

	    return ((expando = settings as ExpandoObject) != null && expando.ContainsKey(name)) || 
		   ((djo = settings as DynamicJsonObject) != null && djo.ContainsKey(name)) || 
		   settings.GetType().GetProperty(name) != null;
}


