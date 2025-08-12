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
    XmlWriterSettings settings = new XmlWriterSettings();
    settings.OmitXmlDeclaration = true;
    settings.ConformanceLevel = ConformanceLevel.Fragment;
    XDocument objectXml = new XDocument();

    using (var xmlWriter = XmlWriter.Create(streamToSerializeTo, settings))
    {
        this.m_regularXmlSerializer.Serialize(xmlWriter, i_objectToSerialize);
    }

    objectXml = XDocument.Load(streamToSerializeTo);
    SerializeExtra (i_objectToSerialize, objectXml);
    byte[] bytesToWrite = Encoding.UTF8.GetBytes(objectXml.ToString());
    i_streamToSerializeTo.Write (bytesToWrite, 0, bytesToWrite.Length);
    streamToSerializeTo.Close();
}


