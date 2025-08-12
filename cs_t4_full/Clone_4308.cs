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
    JToken t = JToken.FromObject (value);
    if (t.Type != JTokenType.Object) {
        t.WriteTo (writer);
        return;
    }
    JObject o = (JObject) t;
    writer.WriteStartObject ();
    foreach (var property in o.Properties())
    {
        var target = property.Value;
        var name = property.Name;
        writer.WritePropertyName(name);
        Type type = value.GetType();
        if (type.IsValueType || type == typeof(string))
        {
            writer.WriteValue(target);
        }
        else 
        {
            serializer.Serialize(writer, property.Value);
        }
    }
    writer.WriteEndObject ();
} 


