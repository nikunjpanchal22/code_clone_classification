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
    XmlSerializer xmlSerializer = new XmlSerializer(typeof(Shipment));
    using (MemoryStream memoryStream = new MemoryStream())
    {
        xmlSerializer.Serialize(memoryStream, this.Shipment);
        memoryStream.Position = 0;
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.Load(memoryStream);
        writer.WriteCData(xmlDocument.OuterXml);
    }
}


