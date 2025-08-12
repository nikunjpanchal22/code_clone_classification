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


 public static bool HasPropertyExists(object settings, string name)
    {
        if (settings is System.Dynamic.ExpandoObject || settings is System.Web.Helpers.DynamicJsonObject)
            return ((IDictionary<string, object>)settings).ContainsKey(name);

        return settings.GetType().GetProperty(name) != null;
} 


