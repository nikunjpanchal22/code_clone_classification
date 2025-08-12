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
    reader.ReadToFollowing("AnotherNode");
    string innerXml = Serializer<AnotherClass>.CreateSerializer().Serialize(reader.ReadOuterXml());
    Remove = (AnotherClass)innerXml.Deserialize(reader);
    while (reader.ReadToFollowing("element")) {
        var obj = (T)Serializer<T>.CreateSerializer().Serialize(reader.ReadOuterXml());
        Updates.Add(obj);
    }
}


