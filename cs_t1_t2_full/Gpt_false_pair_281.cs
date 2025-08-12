public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
    if (! CanConvert (objectType)) {
        throw new NotSupportedException ();
    }
    if (reader.TokenType == JsonToken.Null) {
        reader.Skip ();
        return null;
    } else if (reader.TokenType == JsonToken.StartObject) {
        return new T [] {serializer.Deserialize < T > (reader)};
    } else {
        return serializer.Deserialize < T [] > (reader);
    }
}


 public override object ReadJson (JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer) {
   
            if (!CanConvert(objectType))
            {
               throw new NotSupportedException();
            } 
            if (reader.TokenType == JsonToken.Null)
            {
               reader.Skip();
               return null;
            } 
            else if (reader.TokenType == JsonToken.StartObject)
            {
               var obj = serializer.Deserialize < T > (reader);
               // Package up the single item into an array
               return new List<T>(new T[] { obj }).ToArray();
            } 
            else
            {
               return serializer.Deserialize<T[]>(reader);
            }
}
