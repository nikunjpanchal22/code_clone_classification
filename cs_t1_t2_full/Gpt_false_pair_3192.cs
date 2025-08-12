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
        var serializer = new DataContractSerializer(obj.GetType());
        using (StringWriter sw = new StringWriter())
        using (XmlWriter writer = XmlWriter.Create(sw))
        {
            serializer.WriteObject(writer, obj);
            returnVal = sw.ToString();
        }
    }
    catch (Exception) {
        returnVal = "";
    }
    return returnVal;
}
