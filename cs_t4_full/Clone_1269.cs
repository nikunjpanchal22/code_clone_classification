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
	
	var serializerOfAnotherClass = Serializer<AnotherClass>.CreateSerializer();
	var serializerOfT = Serializer<T>.CreateSerializer();
    
	reader.MoveToContent();
	while (reader.Read()) {
		if (reader.LocalName == "AnotherNode") {
			Remove = (AnotherClass)serializerOfAnotherClass.Deserialize(reader);
			reader.Read();
		}
		while (reader.LocalName == "T") {
			var obj = (T)serializerOfT.Deserialize(reader);
			Updates.Add(obj);
			reader.Read();
		}
		reader.MoveToContent();
	}
}


