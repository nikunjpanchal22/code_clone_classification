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
    String firstKey = null;
    int i = 0;
    int keyCount = Data_Array.Count;
    while (i < keyCount) {
        String key = Data_Array.Keys.ToArray()[i];
        if (Data_Array[key] == value) {
            firstKey = key;
            break;
        }
        i++;
    }
    return firstKey;
}


