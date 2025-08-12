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





public static Dictionary<string, object> toDictionary(NameValueCollection nvc, bool handleMultivalues)
{
    Dictionary<string, object> dict = new Dictionary<string, object>();
    foreach(string key in nvc)
    {
        if(handleMultivalues && nvc.GetValues(key).Length > 1)
            dict[key] = nvc.GetValues(key);
        else
            dict[key] = nvc[key];
    }
    return dict;
}


