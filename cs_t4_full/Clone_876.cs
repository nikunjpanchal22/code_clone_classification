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
    using (MemoryStream ms = new MemoryStream()) {
        XmlSerializer serializer = new XmlSerializer(typeof(Shipment));
        serializer.Serialize(ms, this.Shipment);
        ms.Position = 0;
        using (XmlReader reader = XmlReader.Create(ms)) {
            writer.WriteCData(reader.ReadOuterXml());
        }
    }
}


