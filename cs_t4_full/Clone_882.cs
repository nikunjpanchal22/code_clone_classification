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
    var stringBuilder = new StringBuilder();
    using (XmlWriter stringWriter = XmlWriter.Create(stringBuilder))
    {
        shipmentInfoSerializer.Serialize(stringWriter, this.Shipment);
    }
    writer.WriteCData(stringBuilder.ToString());
}


