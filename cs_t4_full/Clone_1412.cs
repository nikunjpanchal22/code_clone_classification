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
    StringBuilder valueStrings = new StringBuilder();
    foreach (var key in dict.Keys)
    {
        valueStrings.Append(key).Append(": ").Append(dict[key]).AppendLine();
    }
    return valueStrings.ToString();
}


