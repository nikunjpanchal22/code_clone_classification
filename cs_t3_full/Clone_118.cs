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
    MemoryStream streamToSerializeTo = new MemoryStream();
    XmlDictionaryWriter xmlDictionaryWriter = XmlDictionaryWriter.CreateTextWriter(streamToSerializeTo);
    XDocument objectXml = new XDocument();

    this.m_regularXmlSerializer.Serialize(xmlDictionaryWriter, i_objectToSerialize);
    xmlDictionaryWriter.Flush();
    objectXml = XDocument.Load(streamToSerializeTo);
    SerializeExtra (i_objectToSerialize, objectXml);
    byte[] bytesToWrite = Encoding.UTF8.GetBytes(objectXml.ToString());
    i_streamToSerializeTo.Write (bytesToWrite, 0, bytesToWrite.Length);
    streamToSerializeTo.Close();
}


