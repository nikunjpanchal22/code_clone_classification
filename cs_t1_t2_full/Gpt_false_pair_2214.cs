private object ReadObject (JsonReader reader) {
    IDictionary < string, object > expandoObject = new ExpandoObject ();
    while (reader.Read ()) {
        switch (reader.TokenType) {
            case JsonToken.PropertyName :
                string propertyName = reader.Value.ToString ().ToPascalCase ();
                if (! reader.Read ())
                    throw new Exception ("Unexpected end.");
                object v = ReadValue (reader);
                expandoObject [propertyName] = v;
                break;
            case JsonToken.Comment :
                break;
            case JsonToken.EndObject :
                return expandoObject;
        }
    }
    throw new Exception ("Unexpected end.");
}


 private object ReadObject (JsonReader reader) {
    Queue < object > objqueue = new Queue < object > ();
    while (reader.Read ()) {
        switch (reader.TokenType) {
            case JsonToken.PropertyName :
                string propertyName = reader.Value.ToString ().ToSentenceCase ();
                if (! reader.Read ())
                    throw new Exception ("Unexpected end.");
                object v = ReadValue (reader);
                objqueue.Enqueue(v);
                break;
            case JsonToken.Comment :
                break;
            case JsonToken.EndObject :
                return objqueue;
        }
    }
    throw new Exception ("Unexpected end.");
}
