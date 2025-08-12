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


 public override void WriteJson (JsonWriter writer, object value, JsonSerializer serializer) {
        var contextBase = value as ContextBase;
        if (contextBase.Properties != null) 
        {
            var serializer = JsonSerializer.CreateDefault(); //Create Json Serializer
            var writerSetting = new JsonWriterSettings(); // Create a writer settings for jsonwriter
            var jsonWriter = new Utf8JsonWriter(writer, writerSetting);
                foreach(var property in contextBase.Properties)
                {
                    jsonWriter[property.Name] = property.Value; // add each property name and value
                }
                jsonWriter.Flush(); 
        }  
}


