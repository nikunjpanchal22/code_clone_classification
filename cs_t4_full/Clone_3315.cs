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
    if (reader.PeekChar () < 0)
        return null;
    List<char> result = new List<char> ();
    char character;
    while ((character = reader.ReadChar ()) != '\n')
        if (character != '\r')
            result.Add (character);
    return new string (result.ToArray ());
}


