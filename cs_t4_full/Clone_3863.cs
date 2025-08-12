static String findFirstKeyByValue (Dictionary < string, string > Data_Array, String value) {
    if (Data_Array.ContainsValue (value)) {
        foreach (String key in Data_Array.Keys) {
            if (Data_Array [key].Equals (value))
                return key;
        }
    }
    return null;
}





static string findFirstKeyByValue (Dictionary<string, string> data, string value)
{
    foreach(var item in data)
    {
        if(item.Value == value)
            return item.Key;
    }
    return null;
}


