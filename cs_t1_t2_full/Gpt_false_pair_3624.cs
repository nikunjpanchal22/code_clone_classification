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
    JObject o; 
    JArray array; 
    if ((o = token as JObject) != null) { 
        List<JProperty> orderedProperties = new List<JProperty>(o.Properties()); 
        orderedProperties.Sort((x, y) => { 
            return x.Name.CompareTo(y.Name); 
        }); 
        JObject normalized = new JObject(); 
        foreach (JProperty property in orderedProperties) 
        { 
            normalized.Add(property.Name, NormalizeToken(property.Value)); 
        } 
        return normalized; 
    } 
    else if ((array = token as JArray) != null) { 
        for (int i = 0; i < array.Count; i++) 
        { 
            array[i] = NormalizeToken(array[i]); 
        } 
        return array; 
    } 
    else { 
        return token; 
    } 
}
