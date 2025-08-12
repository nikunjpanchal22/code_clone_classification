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





static IDictionary<string, object> NvcToDictionary(NameValueCollection nvc, bool manageMultiValues)
{
    Dictionary<string, object> dict = new Dictionary<string, object>();
    foreach(var key in nvc.AllKeys)
    {
        dict.Add(key, manageMultiValues && nvc.GetValues(key).Length > 1 ? (object)nvc.GetValues(key) : nvc[key]);
    } 
    return dict;
}


