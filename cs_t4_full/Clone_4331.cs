public override void WriteJson (JsonWriter writer, object value, JsonSerializer serializer) {
    var contextBase = value as ContextBase;
    var valueToken = JToken.FromObject (value, new ForcedObjectSerializer ());
    if (contextBase.Properties != null) {
        var propertiesToken = JToken.FromObject (contextBase.Properties);
        foreach (var property in propertiesToken.Children < JProperty > ()) {
            valueToken [property.Name] = property.Value;
        }
    }
    valueToken.WriteTo (writer);
}


 public override void WriteJson (JsonWriter writer, object value, JsonSerializer serializer)
{
    var contextBase = value as ContextBase;
    JToken valueToken = JObject.FromObject(value, new JsonSerializer
    {
        NullValueHandling = NullValueHandling.Ignore
    });
    foreach (var property in contextBase?.Properties ?? Enumerable.Empty<KeyValuePair<string, object>>())
    {
        valueToken[property.Key] = JToken.FromObject(property.Value);
    }

    valueToken.WriteTo(writer);
}


