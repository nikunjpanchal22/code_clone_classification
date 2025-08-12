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


	public void SerializeXml (System.Xml.XmlWriter writer) {
    XmlSerializer keySerializer = new XmlSerializer (typeof (TKey));
    XmlSerializer valueSerializer = new XmlSerializer (typeof (TValue));
    foreach (TKey key in this.Keys) {
        writer.WriteStartElement ("Node");
        writer.WriteNode (keySerializer.Serialize (key), true);
        TValue value = this [key];
        writer.WriteNode (valueSerializer.Serialize (value), true);
        writer.WriteEndElement ();
    }
}


