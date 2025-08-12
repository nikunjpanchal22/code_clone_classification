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


 static Dictionary<string, object> NVC_Dict_Conversion(NameValueCollection nvc, bool handleMoreValsPerKey) 
{
    var res = new Dictionary<string, object>();
    foreach (string k in nvc.Keys) 
    {
        if (handleMoreValsPerKey) 
        {
            string[] values = nvc.GetValues(k);
            if (values.Length == 1) 
            {
                res.Add(k, values[0]);
            }
            else 
            {
                res.Add(k, values);
            }
        }
        else 
        {
           res.Add(k, nvc[k]);
        }
    }

    return res;
}
