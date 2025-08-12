static Dictionary < string, object > NvcToDictionary (NameValueCollection nvc, bool handleMultipleValuesPerKey) {
    var result = new Dictionary < string, object > ();
    foreach (string key in nvc.Keys) {
        if (handleMultipleValuesPerKey) {
            string [] values = nvc.GetValues (key);
            if (values.Length == 1) {
                result.Add (key, values [0]);
            } else {
                result.Add (key, values);
            }
        } else {
            result.Add (key, nvc [key]);
        }
    }
    return result;
}





static Dictionary<string, object> NameValueCollToDict(NameValueCollection nvc, bool handleMultipleLists)
{
    var dictionary = new Dictionary<string, object>();
    foreach (string key in nvc.Keys)
    {
        string[] values = nvc.GetValues(key);
        dictionary.Add(key, handleMultipleLists && values.Length > 1 ? (object)values : values[0]);
    }

    return dictionary;
}


