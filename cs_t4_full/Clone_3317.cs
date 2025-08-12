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





public static string ReadLine(this BinaryReader reader)
{
    if (reader.BaseStream.Position == reader.BaseStream.Length)
        return null;
    var line = new List<char>();
    while (reader.PeekChar() != -1 && (c = reader.ReadChar()) != '\n')
        if (c != '\r')
            line.Add(c);
    return new string(line.ToArray());
}


