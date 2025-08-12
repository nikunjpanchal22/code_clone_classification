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
    if (Data_Array.ContainsValue(value)) 
    { 
        firstKey = Data_Array.FirstOrDefault(x => x.Value == value).Key; 
    } 
    return firstKey;
}


