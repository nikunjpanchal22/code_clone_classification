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
               return new ArraySegment<T>( new T[1] { serializer.Deserialize<T>(reader) } );
            } 
            else
            {
               return serializer.Deserialize<T[]>(reader);
            }
}
