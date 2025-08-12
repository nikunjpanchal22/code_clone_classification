public void ReadXml (System.Xml.XmlReader reader) {
    var keySerializer = new XmlSerializer (typeof (TKey));
    var valueSerializer = new XmlSerializer (typeof (TValue));
    bool wasEmpty = reader.IsEmptyElement;
    reader.Read ();
    if (wasEmpty)
        return;
    while (reader.NodeType != System.Xml.XmlNodeType.EndElement) {
        reader.ReadStartElement ("item");
        reader.ReadStartElement ("key");
        var key = (TKey) keySerializer.Deserialize (reader);
        reader.ReadEndElement ();
        reader.ReadStartElement ("value");
        var value = (TValue) valueSerializer.Deserialize (reader);
        reader.ReadEndElement ();
        this.Add (key, value);
        reader.ReadEndElement ();
        reader.MoveToContent ();
    }
    reader.ReadEndElement ();
}


public void ReadXml (System.Xml.XmlReader reader)
{
    if (reader.MoveToContent() == XmlNodeType.Element && reader.LocalName == "item")
    {
        var keySerializer = new XmlSerializer (typeof (TKey));
        var valueSerializer = new XmlSerializer (typeof (TValue));
        bool wasEmpty = reader.IsEmptyElement;
        reader.ReadStartElement();
        if (wasEmpty)
            return;
        while (reader.MoveToContent() == XmlNodeType.Element && reader.LocalName == "key")
        {
            var key = (TKey) keySerializer.Deserialize (reader);
            reader.ReadEndElement();
            reader.MoveToContent();
            if(reader.NodeType == XmlNodeType.Element && reader.LocalName == "value")
            {
                var value = (TValue) valueSerializer.Deserialize (reader);
                reader.ReadEndElement();
                this.Add (key, value);
                reader.MoveToContent();
            }
        }
        reader.ReadEndElement();
    }
} 


