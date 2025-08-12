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
	writer.WriteStartObject();
	WriteJson(writer, o.Properties());
	writer.WriteEndObject();
}
