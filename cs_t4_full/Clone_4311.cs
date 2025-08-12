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


 public override void WriteJson (JsonWriter writer, object value, JsonSerializer serializer) {
    JObject o = JObject.FromObject (value);
    writer.WriteStartObject ();
    foreach (var property in o.Properties())
    {
        writer.WritePropertyName(property.Name);
        if (property.Value is JObject || property.Value is JArray)
        {
            serializer.Serialize (writer, property.Value);
        }
        else
        {
            writer.WriteValue(property.Value);
        }
    }
    writer.WriteEndObject ();
}


