private static string DictionaryToString (IDictionary dict) {
    if (null == dict)
        throw new ArgumentNullException ("dict");
    var valueStrings = new List < string > ();
    foreach (DictionaryEntry item in dict) {
        valueStrings.Add (item.Key + ": " + item.Value);
    }
    return string.Join ("\n", valueStrings.ToArray ());
}


 private static string DictionaryToString (IDictionary dict) {
    if (dict == null)
        throw new ArgumentNullException ("dict");
    List<string> valueString = new List<string>();
    foreach (var entry in dict.Keys) {
        valueString.Add(entry + ":" + dict[entry]);
    }
    return string.Join("\n", valueString);
}


