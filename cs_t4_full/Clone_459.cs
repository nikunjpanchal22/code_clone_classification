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


 public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
{
            var contextBase = value as ContextBase;
            if (contextBase.Properties != null) 
            {
                var jsonObject = JObject.FromObject(value);
                foreach (var property in contextBase.Properties)
                {
                    jsonObject.Add(property.Name, property.Value.ToString());
                }
                serializer.Serialize(writer, jsonObject); 
            }
}


