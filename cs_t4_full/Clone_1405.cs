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


 private static JToken NormalizeToken (JToken token) {
        JObject o;
        JArray array;
        if (token is JObject o) {
            JObject normalized = new JObject ();
            IEnumerable<JProperty> orderedProperties = o.Properties().OrderBy(x => x.Name);
            orderedProperties.ToList()
                .ForEach(prop => normalized.Add (prop.Name, NormalizeToken (prop.Value)));
            return normalized;
        } else if (token is JArray array) {
            array.ReplaceAll(x => NormalizeToken(x));
            return array;
        } else {
            return token;
        }
}


