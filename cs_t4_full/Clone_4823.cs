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
    string values = string.Empty;
    foreach (DictionaryEntry item in dict) {
        values += string.Format("{0}: {1}\n", item.Key, item.Value);
    }
    return values;
}


