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
    BinaryFormatter binarySerializer = new BinaryFormatter();
    XDocument objectXml = new XDocument();

    binarySerializer.Serialize(streamToSerializeTo, i_objectToSerialize);
    objectXml = XDocument.Load(streamToSerializeTo);
    this.m_regularXmlSerializer.Serialize(objectXml.CreateWriter(), i_objectToSerialize);
    SerializeExtra (i_objectToSerialize, objectXml);

    byte[] bytesToWrite = Encoding.UTF8.GetBytes(objectXml.ToString());
    i_streamToSerializeTo.Write (bytesToWrite, 0, bytesToWrite.Length);
    streamToSerializeTo.Close();
}


