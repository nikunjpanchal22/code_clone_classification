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


 
static Dictionary<string, object> NvcToDictionary(NameValueCollection nvc, bool handleMultipleValuesPerKey)
{
    var result = new Dictionary<string, object>();
    string[] values;

    if (handleMultipleValuesPerKey)
    {
        foreach (string key in nvc.Keys)
        {
            values = nvc.GetValues(key);
            result.Add(key, values.Length == 1 ? values[0] : values);
        }
    }
    else //Single value is stored
    {
        foreach (string key in nvc.Keys)
            result.Add(key, nvc.GetValues(key)[0]);
    }

    return result;
}


