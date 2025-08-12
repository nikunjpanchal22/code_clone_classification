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
    StringBuilder sb = new StringBuilder();
    char c;
    while (((c = reader.ReadChar()) != '\n') && reader.PeekChar() != -1)
        if (c != '\r') 
            sb.Append(c);
    return sb.ToString();
}


