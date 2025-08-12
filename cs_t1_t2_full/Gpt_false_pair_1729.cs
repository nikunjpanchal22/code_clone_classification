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
    char ch;
    while (!reader.IsEndOfStream() && (ch = reader.ReadChar()) != '\n')
        if (ch != '\r' && ch != '\n')
            readLine.Append(ch);

    return readLine.ToString();
}
