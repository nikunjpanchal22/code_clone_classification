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
    if (t.Type != JTokenType.Object)
    {
        t.WriteTo(writer);
        return;
    }
    JObject o = (JObject)t;
 
    // mark the output for easy debugging
    writer.WriteStartObject();
    string prefix = "obj" + Guid.NewGuid().ToString().Substring(0, 4);
    writer.WritePropertyName(prefix);

    // write inner contents
    if (o.Count > 0)
    {
        writer.WriteStartObject();
        WriteJson(writer, o);
        writer.WriteEndObject();
    }
    else
    {
        writer.WriteNull();
    }

    writer.WriteEndObject();
}


