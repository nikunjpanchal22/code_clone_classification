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
    if(reader.BaseStream.Length == 0)
        return null;
    string result = string.Empty;
    char c;
    while((c = reader.ReadChar()) != '\n') 
        if (c != '\r') 
            result += c;
    return result;
}


