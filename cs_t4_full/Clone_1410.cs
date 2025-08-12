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
    StringBuilder sb = new StringBuilder();
    foreach (var key in dict.Keys)
    {
        sb.AppendFormat("{0}: {1}\n", key, dict[key]);
    }
    return sb.ToString();
}


