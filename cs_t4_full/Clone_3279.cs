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
    reader.MoveToContent();
    while(reader.Read()) {
        if(reader.NodeType == XmlNodeType.Element) {
            if(reader.LocalName.Equals("AnotherNode")) {
                Remove = (AnotherClass)Serializer<AnotherClass>.CreateSerializer().Deserialize(reader);
            } else {
                Updates.Add((T)Serializer<T>.CreateSerializer().Deserialize(reader));
            }
        }
    }
}


