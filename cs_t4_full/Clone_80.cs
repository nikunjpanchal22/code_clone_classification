public void Serialize (object i_objectToSerialize, Stream i_streamToSerializeTo) {
    StringWriter sw = new StringWriter ();
    this.m_regularXmlSerializer.Serialize (sw, i_objectToSerialize);
    XDocument objectXml = XDocument.Parse (sw.ToString ());
    sw.Dispose ();
    SerializeExtra (i_objectToSerialize, objectXml);
    string res = objectXml.ToString ();
    byte [] bytesToWrite = Encoding.UTF8.GetBytes (res);
    i_streamToSerializeTo.Write (bytesToWrite, 0, bytesToWrite.Length);
}


 public void Serialize (object i_objectToSerialize, Stream i_streamToSerializeTo)
{
    XmlSerializerNamespaces xmlSerializerNamespaces = new XmlSerializerNamespaces();
    XmlSerializer serializer = new XmlSerializer(i_objectToSerialize.GetType());
    StreamWriter sw = new StreamWriter(i_streamToSerializeTo);
    serializer.Serialize(sw, i_objectToSerialize, xmlSerializerNamespaces);
    sw.Flush();
    XDocument objectXml = XDocument.Load(i_streamToSerializeTo);
    SerializeExtra (i_objectToSerialize, objectXml);
    byte[] bytesToWrite = Encoding.UTF8.GetBytes(objectXml.ToString());
    i_streamToSerializeTo.Write (bytesToWrite, 0, bytesToWrite.Length);
    sw.Close();
}


