public void WriteXml (System.Xml.XmlWriter writer) {
    XmlSerializer keySerializer = new XmlSerializer (typeof (TKey));
    XmlSerializer valueSerializer = new XmlSerializer (typeof (TValue));
    foreach (TKey key in this.Keys) {
        writer.WriteStartElement ("item");
        writer.WriteStartElement ("key");
        keySerializer.Serialize (writer, key);
        writer.WriteEndElement ();
        writer.WriteStartElement ("value");
        TValue value = this [key];
        valueSerializer.Serialize (writer, value);
        writer.WriteEndElement ();
        writer.WriteEndElement ();
    }
}


	public void GenerateXmlFileToStream(System.Xml.XmlWriter writer) {
    XmlSerializer serializer = new XmlSerializer(typeof(System.Collections.Generic.Dictionary<TKey, TValue>));
    StreamReader sr = new StreamReader(Path.GetFullPath(path));
    serializer.Serialize(sr, this);
    sr.Close();
}


