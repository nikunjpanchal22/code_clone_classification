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
    char[] characters = new char[255];
    int i = 0;
    while (! reader.IsEndOfStream () && (characters[i] = reader.ReadChar ()) != '\n')
        if (characters[i] != '\r' && characters[i] != '\n')
            i++;
    return new string (characters, 0, i);
}


