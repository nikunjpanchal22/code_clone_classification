private static string DictionaryToString (IDictionary dict) {
    if (null == dict)
        throw new ArgumentNullException ("dict");
    var valueStrings = new List < string > ();
    foreach (DictionaryEntry item in dict) {
        valueStrings.Add (item.Key + ": " + item.Value);
    }
    return string.Join ("\n", valueStrings.ToArray ());
}


 private static string DictionaryToString (IDictionary dict)
    {
        if (dict == null)
            throw new ArgumentNullException("dict");
        List<string> list = new List<string>();
        foreach (object key in dict.Keys)
        {
            list.Add(string.Format("{0}: {1}", key, dict[key].ToString()));
        }
        return string.Join("\n", list.ToArray());
    }

 private static string DictionaryToString (IDictionary dict)
    {
        if (dict == null)
            throw new ArgumentNullException("dict");
        var resultList = from pair in dict
                         select pair.Key + ": " + pair.Value;
        return string.Join("\n", resultList);
    }

 private static string DictionaryToString (IDictionary dict) {
    if (dict == null)
        throw new ArgumentNullException ("dict");
    StringBuilder valueString = new StringBuilder();
    foreach (object key in dict.Keys) {
		valueString.AppendFormat("{0}: {1}\n", key, dict[key]);
	}
	return valueString.ToString();
}


