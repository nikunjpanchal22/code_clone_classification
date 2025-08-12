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
            var valueToken = JToken.FromObject(value);
            if (contextBase.Properties != null) 
            {
                foreach (var property in contextBase.Properties)
                {
                    var propertyObject = JObject.FromObject(property);
                    valueToken[property.Name] = propertyObject.PropertyValues();
                }
                serializer.Serialize(writer, valueToken);
            }
}


