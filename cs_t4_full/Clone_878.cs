public void WriteXml (XmlWriter writer) {
    using (MemoryStream ms = new MemoryStream ())
    {
        using (XmlWriter innerWriter = XmlWriter.Create (ms, new XmlWriterSettings {OmitXmlDeclaration = true}))
        {
            shipmentInfoSerializer.Serialize (innerWriter, this.Shipment);
            innerWriter.Flush ();
            writer.WriteCData (Encoding.UTF8.GetString (ms.ToArray ()));
        }}
}


 public void WriteXml (XmlWriter writer) {
    using (Stream stream = new MemoryStream())
    {
        shipmentInfoSerializer.Serialize(stream, this.Shipment);
        stream.Seek(0, 0);
        using (StreamReader reader = new StreamReader(stream))
        {
            writer.WriteCData(reader.ReadToEnd());
        }
    }
}


