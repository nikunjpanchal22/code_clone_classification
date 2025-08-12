public override void WriteJson (JsonWriter writer, object value, JsonSerializer serializer) {
    JToken t = JToken.FromObject (value);
    if (t.Type != JTokenType.Object) {
        t.WriteTo (writer);
        return;
    }
    JObject o = (JObject) t;
    writer.WriteStartObject ();
    WriteJson (writer, o);
    writer.WriteEndObject ();
}


 public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
{
    JToken t = JToken.FromObject(value);

    // Check if current token is an object
    if (t.Type != JTokenType.Object)
    {
        t.WriteTo(writer);
        return;
    }

    JObject o = (JObject)t;
    
    // Start writing object
    writer.WriteStartObject();
    foreach (var prop in o.Properties().OrderBy(x => x.Name))
    {
        // Write property name
        writer.WritePropertyName(prop.Name);
       
        // Write property value
        prop.Value.WriteTo(writer);
    }

    // End writing object
    writer.WriteEndObject();
}


