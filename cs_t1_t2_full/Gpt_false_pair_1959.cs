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


  static Dictionary<string, object> TransformNVCtoDictionary(NameValueCollection nvc, bool handleMultipleValuesPerKey) 
{
    var output = new Dictionary<string, object>();

    foreach (string keyword in nvc.Keys) 
    {
        if (handleMultipleValuesPerKey) 
        {
            string[] values = nvc.GetValues(keyword);
            if (values.Length == 1) 
            {
                output.Add(keyword, values[0]);
            }
            else 
            {
                output.Add(keyword, values);
            }
        }
        else 
        {
            output.Add(keyword, nvc[keyword]);
        }
    }

    return output;
}
