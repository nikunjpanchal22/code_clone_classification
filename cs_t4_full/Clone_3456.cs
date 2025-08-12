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





static Dictionary<string, object> TransformNVCtoDict(NameValueCollection nvc, bool manageDuplications)
{
    Dictionary<string, object> dict = new Dictionary<string, object>();
    foreach(var key in nvc.AllKeys)
    {
        dict.Add(key, manageDuplications ? nvc.GetValues(key) : new[] { nvc[key] });
    } 
    return dict;
}


