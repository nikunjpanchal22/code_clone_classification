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


 public static bool HasPropertyExist (dynamic settings, string name) 
{
    return settings is System.Dynamic.ExpandoObject
        ? ((IDictionary < string, object >) settings).ContainsKey (name)
        : settings is System.Web.Helpers.DynamicJsonObject
            ? (settings [name] != null)
            : settings.GetType().GetProperty(name) != null;
}


