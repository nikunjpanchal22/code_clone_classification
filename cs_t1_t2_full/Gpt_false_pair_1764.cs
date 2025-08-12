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
	bool flag = reader.IsEmptyElement;
	reader.Read ();
	if (flag)
		return;
	while (reader.NodeType != System.Xml.XmlNodeType.EndElement) 
	{
		reader.ReadStartElement ("item");
		var keySerializerObject = new XmlSerializer (typeof (TKey));
		reader.ReadStartElement ("key");
		var keyObject = (TKey) keySerializerObject.Deserialize (reader);
		reader.ReadEndElement ();
		reader.ReadStartElement ("value");
		var valueSerializer = new XmlSerializer (typeof (TValue));
		var value = (TValue) valueSerializer.Deserialize (reader);
		reader.ReadEndElement ();
		this.Add (keyObject, value);
		reader.ReadEndElement ();
		reader.MoveToContent ();
	}
	reader.ReadEndElement ();
}
