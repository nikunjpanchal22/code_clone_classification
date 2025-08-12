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
    if (reader.IsEndOfStream())
        return null;
    StringBuilder readLine = new StringBuilder();
    char character = reader.ReadChar();
    while (!reader.IsEndOfStream() && (character != '\n')) {
        if (character != '\r' && character != '\n')
            readLine.Append(character);
        character = reader.ReadChar();
    }
    return readLine.ToString();
}


