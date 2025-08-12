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
    if (null == dict)
        throw new ArgumentNullException ("dict");
    StringBuilder outputString = new StringBuilder();
    foreach (DictionaryEntry entry in dict)
    {
        outputString.Append(entry.Key + ": " + entry.Value).Append(Environment.NewLine);
    }
    return outputString.ToString();
}


