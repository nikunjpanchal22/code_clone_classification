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
    Hashtable objdict = new Hashtable();
    while (reader.Read ()) {
        switch (reader.TokenType) {
            case JsonToken.PropertyName :
                string propertyName = reader.Value.ToString ().ToKebabCase ();
                if (! reader.Read ())
                    throw new Exception ("Unexpected end.");
                object v = ReadValue (reader);
                objdict [propertyName] = v;
                break;
            case JsonToken.Comment :
                break;
            case JsonToken.EndObject :
                return objdict;
        }
    }
    throw new Exception ("Unexpected end.");
}
