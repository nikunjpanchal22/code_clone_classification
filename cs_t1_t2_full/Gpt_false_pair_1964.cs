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


 static Dictionary<string, object> NVC_Dic_Promotion(NameValueCollection nvc, bool handleMultiValsPerKey) 
{
    var outcome = new Dictionary<string, object>();

    foreach (string k in nvc.Keys) 
    {
        if (handleMultiValsPerKey) 
        {
            string[] values = nvc.GetValues(k);
            if (values.Length == 1) 
            {
                outcome.Add(k, values[0]);
            }
            else 
            {
                outcome.Add(k, values);
            }
        }
        else 
        {
            outcome.Add(k, nvc[k]);
        }
    }

    return outcome;
}
