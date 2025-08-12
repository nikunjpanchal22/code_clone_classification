public static string ReadLine (this BinaryReader reader) {
    if (reader.IsEndOfStream ())
        return null;
    StringBuilder result = new StringBuilder ();
    char character;
    while (! reader.IsEndOfStream () && (character = reader.ReadChar ()) != '\n')
        if (character != '\r' && character != '\n')
            result.Append (character);
    return result.ToString ();
}


 public static string ReadLine (this BinaryReader reader) {
    if (reader.IsEndOfStream ())
        return null;
    StringBuilder readLine = new StringBuilder ();
    while (! reader.IsEndOfStream ()) {
        char character = reader.ReadChar ();
        if (character == '\r' || character == '\n') {
            break;
        }
        readLine.Append (character);
    }
    return readLine.ToString ();
}


