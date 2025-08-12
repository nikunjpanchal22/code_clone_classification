private static JToken NormalizeToken (JToken token) {
    JObject o;
    JArray array;
    if ((o = token as JObject) != null) {
        List < JProperty > orderedProperties = new List < JProperty > (o.Properties ());
        orderedProperties.Sort (delegate (JProperty x, JProperty y) {
            return x.Name.CompareTo (y.Name);
        });
        JObject normalized = new JObject ();
        foreach (JProperty property in orderedProperties) {
            normalized.Add (property.Name, NormalizeToken (property.Value));
        }
        return normalized;
    } else if ((array = token as JArray) != null) {
        for (int i = 0; i < array.Count; i ++) {
            array [i] = NormalizeToken (array [i]);
        }
        return array;
    } else {
        return token;
    }
}


 private static JToken NormalizeToken(JToken token)
{
    if (token.Type == JTokenType.Object)
    {
        JObject obj = (JObject)token;
        var properties = obj.Properties().OrderBy(p => p.Name).ToList();
        JObject newObj = new JObject();
        foreach (JProperty property in properties)
        {
            newObj.Add(property.Name, NormalizeToken(property.Value));
        }
        return newObj;
    }

    if (token.Type == JTokenType.Array)
    {
        JArray array = (JArray)token;
        foreach (JToken item in array)
        {
            array[item] = NormalizeToken(item);
        }
        return array;
    }

    return token;
}


