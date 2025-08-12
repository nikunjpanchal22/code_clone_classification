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
    SortedList<string,object> objlist = new SortedList<string,object> ();
    while (reader.Read ()) {
        switch (reader.TokenType) {
            case JsonToken.PropertyName :
                string propertyName = reader.Value.ToString ().ToLowerFirstCase ();
                if (! reader.Read ())
                    throw new Exception ("Unexpected end.");
                object v = ReadValue (reader);
                objlist [propertyName] = v;
                break;
            case JsonToken.Comment :
                break;
            case JsonToken.EndObject :
                return objlist;
        }
    }
    throw new Exception ("Unexpected end.");
}
