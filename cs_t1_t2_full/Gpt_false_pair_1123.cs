public override void WriteJson (JsonWriter writer, object value, JsonSerializer serializer) {
    if (value == null) {
        writer.WriteNull ();
        return;
    }
    var model = value as MyModel;
    if (model == null)
        throw new JsonSerializationException ();
    writer.WriteStartObject ();
    writer.WritePropertyName ("name");
    writer.WriteValue (model.Name);
    writer.WritePropertyName ("details");
    writer.WriteStartObject ();
    writer.WritePropertyName ("size");
    serializer.Serialize (writer, model.Size);
    writer.WritePropertyName ("weight");
    writer.WriteValue (model.Weight);
    writer.WriteEndObject ();
    writer.WriteEndObject ();
}


 public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
{
    if (value == null) {
        writer.WriteNull();
        return;
    }
    var model = value as MyModel;
    if (model == null)
        throw new JsonSerializationException();
    writer.WriteStartObject();
    writer.WritePropertyName("collectionName");
    writer.WriteValue(model.Name);
    writer.WritePropertyName("data");
    writer.WriteStartObject();
    writer.WritePropertyName("depth");
    serializer.Serialize(writer, model.Size);
    writer.WritePropertyName("weight");
    writer.WriteValue(model.Weight);
    writer.WriteEndObject();
    writer.WriteEndObject();
}
