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



	public void WriteXmlToTextWriter (System.Xml.XmlWriter writer) {
    XmlSerializer serializer = new XmlSerializer (typeof (System.Collections.Generic.Dictionary<TKey, TValue>));
    StringWriter sw = new StringWriter ();
    serializer.Serialize (sw, this);
    sw.Close ();
}


