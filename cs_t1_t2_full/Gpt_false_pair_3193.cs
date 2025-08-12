public static string Serialize < T > (T obj) {
    string returnVal = "";
    try {
        DataContractJsonSerializer serializer = new DataContractJsonSerializer (obj.GetType ());
        using (MemoryStream ms = new MemoryStream ())
        {
            serializer.WriteObject (ms, obj);
            returnVal = Encoding.Default.GetString (ms.ToArray ());
        }}
    catch (Exception) {
        returnVal = "";
    }
    return returnVal;
}


public static string Serialize < T > (T obj) {
    string returnVal = "";
    try {
        XmlSerializer serializer = new XmlSerializer (obj.GetType ());
        using (StringWriter sw = new StringWriter())
        {
            serializer.Serialize(sw, obj);
            returnVal = sw.ToString ();
        }
    } catch (Exception) {
        returnVal = "";
    }
    return returnVal;
}
