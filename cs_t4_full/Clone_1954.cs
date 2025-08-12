static String findFirstKeyByValue (Dictionary < string, string > Data_Array, String value) {
    if (Data_Array.ContainsValue (value)) {
        foreach (String key in Data_Array.Keys) {
            if (Data_Array [key].Equals (value))
                return key;
        }
    }
    return null;
}


 static String findFirstKeyByValue (Dictionary < string, string > Data_Array, String value) {
    if (!Data_Array.ContainsValue (value))
        return null;

    foreach (KeyValuePair<string, string> entry in Data_Array) {
        if (entry.Value == value) {
            return entry.Key;
        }
    }

    return null;
}


