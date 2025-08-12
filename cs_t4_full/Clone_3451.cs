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





public static Dictionary<string, object> NvcToDict(NameValueCollection nvc, bool handleMultiple)
{
    Dictionary<string, object> nvcDictionary = new Dictionary<string, object>();
    foreach (string key in nvc.Keys)
    {
        string[] values = nvc.GetValues(key);

        if (handleMultiple)
            nvcDictionary[key] = values.Length == 1 ? (object)values[0] : values;
        else
            nvcDictionary[key] = values[0];
    }

    return nvcDictionary;
}


