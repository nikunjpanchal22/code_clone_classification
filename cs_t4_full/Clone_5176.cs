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


 public static bool HasPropertyExist(dynamic settings, string name) 
{
    bool foundValue = false;

    if (settings is System.Dynamic.ExpandoObject)
    {
        foreach (KeyValuePair<string, object> kvp in settings)
        {
            if (String.Equals(kvp.Key, name))
            {
                foundValue = true;
            }
        }
    }
    else if (settings is System.Web.Helpers.DynamicJsonObject)
    {
        try
        {
            if (settings[name] != null)
            {
                foundValue = true;
            }
        }
        catch (KeyNotFoundException)
        {
            foundValue = false;
        }
    }
    else
    {
        foundValue = (settings.GetType().GetProperty(name) != null);
    }

    return foundValue;
}


