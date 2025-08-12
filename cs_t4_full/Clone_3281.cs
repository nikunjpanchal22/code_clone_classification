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
    reader.ReadStartElement("AnotherNode");
    XmlSerializer innerXml = new XmlSerializer(typeof(AnotherClass));
    Remove = (AnotherClass)innerXml.Deserialize(reader);
    while (reader.ReadStartElement("element")) {
        XmlSerializer serializer = new XmlSerializer(typeof(T));
        T data = (T)serializer.Deserialize(reader);
        Updates.Add(data);
    }
}


