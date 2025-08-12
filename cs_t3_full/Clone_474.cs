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
    if(t.Type != JTokenType.Object) 
    { 
        t.WriteTo(writer); 
        return; 
    }
  
    JObject o = (JObject)t;  
    writer.WriteStartObject(); 
    // for each key and value
    for (int i = 0; i < o.Properties().Count(); i++) 
    { 
        writer.WritePropertyName(o.Properties().ElementAt(i).Name); 
        o.Properties().ElementAt(i).Value.WriteTo(writer); 
    } 
    writer.WriteEndObject(); 
} 


