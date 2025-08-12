public void ReadXml (System.Xml.XmlReader reader) {
    reader.Read ();
    reader.MoveToContent ();
    if (reader.LocalName == "AnotherNode") {
        var innerXml = Serializer < AnotherClass >.CreateSerializer ();
        Remove = (AnotherClass) innerXml.Deserialize (reader);
        reader.MoveToContent ();
    }
    reader.Read ();
    if (reader.IsStartElement ()) {
        do
            {
                var innerXml = Serializer < T >.CreateSerializer ();
                var obj = (T) innerXml.Deserialize (reader);
                Updates.Add (obj);
            } while (reader.MoveToContent () == XmlNodeType.Element);
    }
}





public void ReadXml(System.Xml.XmlReader reader) {
    reader.Read();
    var innerSerializer = new XmlSerializer(typeof(AnotherClass));
    if (reader.NodeType == XmlNodeType.Element && reader.LocalName == "AnotherNode") {
        Remove = (AnotherClass)innerSerializer.Deserialize(reader);
    }
    var serializer = new XmlSerializer(typeof(T));
    while (reader.Read()) {
        if (reader.NodeType == XmlNodeType.Element) {
            Updates.Add((T)serializer.Deserialize(reader));
        }
    }
}


