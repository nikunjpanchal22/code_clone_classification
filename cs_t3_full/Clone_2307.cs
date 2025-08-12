static bool IsXmlRooted (Stream st) {
    bool sawRoot = false;
    using (var reader = XmlReader.Create (st, new XmlReaderSettings () {ConformanceLevel = ConformanceLevel.Fragment}))
    {
        while (reader.Read ()) {
            if (reader.NodeType == XmlNodeType.Element && reader.Depth == 0) {
                if (sawRoot)
                    return false;
                sawRoot = true;
            }
        }
    } return true;
}


 

static bool IsXmlRooted (Stream stream) {
    bool rootFound = false;
    var xmlReaderOptions = new XmlReaderSettings {ConformanceLevel = ConformanceLevel.Fragment};
    using (var xmlreader = XmlReader.Create(stream, xmlReaderOptions))
        while (xmlreader.Read())
            if (xmlreader.NodeType == XmlNodeType.Element && xmlreader.Depth == 0)
                if (rootFound) return false;
                else rootFound = true;
    return true;
}


