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
    
    // get all property names
    var propertyNames = o.Properties().Select(x => x.Name);
    
    // create a list of unique property names
    var uniquePropertyNames = propertyNames.Distinct();
    
    // add each unique property name to the json writer
    foreach (string name in uniquePropertyNames)
    { 
         writer.WritePropertyName(name); 
         o[name].WriteTo(writer); 
    } 
    writer.WriteEndObject(); 
} 


