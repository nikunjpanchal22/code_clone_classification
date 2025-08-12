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
    XmlDocument doc = new XmlDocument();
    XmlElement root = doc.CreateElement("Root");
    doc.AppendChild(root);
    shipmentInfoSerializer.Serialize(doc, root, this.Shipment);
    MemoryStream ms = new MemoryStream();
    doc.Save(ms);
    writer.WriteCData(Encoding.UTF8.GetString(ms.ToArray()));
}


