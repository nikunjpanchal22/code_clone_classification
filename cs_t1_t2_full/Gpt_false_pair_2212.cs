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
    Stack <object> objstack = new Stack <object> ();
    while (reader.Read ()) {
        switch (reader.TokenType) {
            case JsonToken.PropertyName :
                string propertyName = reader.Value.ToString ().ToTitleCase ();
                if (! reader.Read ())
                    throw new Exception ("Unexpected end.");
                object v = ReadValue (reader);
                objstack.Push (v);
                break;
            case JsonToken.Comment :
                break;
            case JsonToken.EndObject :
                return objstack;
        }
    }
    throw new Exception ("Unexpected end.");
}
