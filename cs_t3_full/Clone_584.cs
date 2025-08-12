public void ReadXml (System.Xml.XmlReader reader) {
    XmlSerializer keySerializer = new XmlSerializer (typeof (TKey));
    XmlSerializer valueSerializer = new XmlSerializer (typeof (TValue));
    bool wasEmpty = reader.IsEmptyElement;
    reader.Read ();
    if (wasEmpty)
        return;
    while (reader.NodeType != System.Xml.XmlNodeType.EndElement) {
        reader.ReadStartElement ("item");
        reader.ReadStartElement ("key");
        TKey key = (TKey) keySerializer.Deserialize (reader);
        reader.ReadEndElement ();
        reader.ReadStartElement ("value");
        TValue value = (TValue) valueSerializer.Deserialize (reader);
        reader.ReadEndElement ();
        this.Add (key, value);
        reader.ReadEndElement ();
        reader.MoveToContent ();
    }
    reader.ReadEndElement ();
}


  public void ReadXml (System.Xml.XmlReader reader) {
    int count = 0;
    XmlSerializer keySerializer = new XmlSerializer (typeof (TKey));
    XmlSerializer valueSerializer = new XmlSerializer (typeof (TValue));
    bool wasEmpty = reader.IsEmptyElement;
    reader.Read ();
    if (wasEmpty) {
        return;
    }
    while (reader.NodeType != System.Xml.XmlNodeType.EndElement) {
        reader.ReadStartElement ("item");
        reader.ReadStartElement ("key");
        TKey key = (TKey) keySerializer.Deserialize (reader);
        reader.ReadEndElement ();
        reader.ReadStartElement ("value");
        TValue value = (TValue) valueSerializer.Deserialize (reader);
        reader.ReadEndElement ();
        bool isValid = false;
        if(key.GetType() == typeof(string)) {
            if(!string.IsNullOrEmpty((string)key)) {
                isValid = true;
            }
        } else {
            isValid = true;
        }
        if(isValid) {
            this.Add (key, value);
            count++;
        }
        reader.ReadEndElement ();
        reader.MoveToContent ();
    }
    reader.ReadEndElement ();
}


