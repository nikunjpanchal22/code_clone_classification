static void Main (string [] args) {
    long NumberToEncode = (new Random ()).Next ();
    Console.WriteLine ("Number to encode = {0}.", NumberToEncode);
    byte [] Key = new byte [24];
    (new RNGCryptoServiceProvider ()).GetBytes (Key);
    Console.WriteLine ("Key to encode with is {0}.", ToHex (Key));
    string EncodedValue = Encode (NumberToEncode, Key);
    Console.WriteLine ("The encoded value is {0}.", EncodedValue);
    long DecodedValue;
    bool Success = TryDecode (EncodedValue, Key, out DecodedValue);
    if (Success) {
        Console.WriteLine ("Successfully decoded the encoded value.");
        Console.WriteLine ("The decoded result is {0}.", DecodedValue);
    } else
        Console.WriteLine ("Failed to decode encoded value. Invalid result.");
}


 static void Main (string [] args) {
    decimal NumberToEncode = (new Random ()).Next ();
    Console.WriteLine ("Number to encode = {0}.", NumberToEncode);
    byte [] Key = new byte [24];
    (new RNGCryptoServiceProvider ()).GetBytes (Key);
    Console.WriteLine ("Key to encode with is {0}.", ToHex (Key));
    string EncodedValue = EncodeUsingCFB (NumberToEncode, Key);
    Console.WriteLine ("The encoded value is {0}.", EncodedValue);
    decimal DecodedValue;
    bool Success = TryDecodeCFB (EncodedValue, Key, out DecodedValue);
    if (Success) {
        Console.WriteLine ("Successfully decoded the encoded value.");
        Console.WriteLine ("The decoded result is {0}.", DecodedValue);
    } else
        Console.WriteLine ("Failed to decode encoded value. Invalid result.");
}
