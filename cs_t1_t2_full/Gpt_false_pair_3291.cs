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


public void ReadXml (System.Xml.XmlReader reader) {
    bool continueReading = true; 
    while (continueReading) {
        reader.Read ();
        reader.MoveToContent ();
        if (reader.LocalName == "AnotherNode") {
            var innerXml = Serializer < AnotherClass >.CreateSerializer ();
            Remove = (AnotherClass) innerXml.Deserialize (reader);
            reader.MoveToContent ();
        }
        if (reader.IsStartElement ()) {
            do
            {
                var innerXml = Serializer < T >.CreateSerializer ();
                var obj = (T) innerXml.Deserialize (reader);
                Updates.Add (obj);
            } while (reader.MoveToContent () == XmlNodeType.Element);
        }
        if (reader.NodeType == XmlNodeType.EndElement) { 
            continueReading = false; 
        }
    }
}
