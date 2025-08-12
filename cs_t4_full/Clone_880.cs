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
    string xmlString;
    using (XmlWriter innerWriter = XmlWriter.Create(new MemoryStream(), new XmlWriterSettings { OmitXmlDeclaration = true }))
    {
        shipmentInfoSerializer.Serialize(innerWriter, this.shipment);
        innerWriter.Flush();
        xmlString = Encoding.UTF8.GetString(innerWriter.Flush());
    }
    writer.WriteCData(xmlString);
}


