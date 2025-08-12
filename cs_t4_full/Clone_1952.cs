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
    var dataArrayKeys = Data_Array.Keys;
    for (int i = 0; i < dataArrayKeys.Count; i++) {
        String key = dataArrayKeys.ElementAt(i);
        if (Data_Array[key] == value) {
            firstKey = key;
            break;
        }
    }
    return firstKey;
}


