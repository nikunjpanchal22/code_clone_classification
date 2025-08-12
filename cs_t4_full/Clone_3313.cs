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
    if(reader.BaseStream.Position == reader.BaseStream.Length)
        return null;
    List<char> charList = new List<char>();
    char c;
    while((c = reader.ReadChar()) != '\n') 
        if(c != '\r') 
            charList.Add(c);
    return new string(charList.ToArray());
}


