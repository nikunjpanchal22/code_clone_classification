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
    IDictionary<string,object> dict;
    
    if (settings is System.Dynamic.ExpandoObject)
        dict = ((IDictionary < string, object >) settings);
    else if (settings is System.Web.Helpers.DynamicJsonObject)
        dict = (IDictionary<string, object>)settings;
    else
        return settings.GetType ().GetProperty (name) != null;
    
    foreach (var kvp in dict)
        if (kvp.Key.Equals (name))
            return true;
    return false;
}


