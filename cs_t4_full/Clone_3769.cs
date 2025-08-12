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


 

static bool IsXmlRooted(Stream st) {
    var sawRoot = false;
    var settings = new XmlReaderSettings {ConformanceLevel = ConformanceLevel.Fragment};
    using (var reader = XmlReader.Create(st, settings))
        while (reader.Read())
            if (reader.NodeType.Equals(XmlNodeType.Element) && reader.Depth == 0) {
                if (sawRoot) return false;
                else sawRoot = true;
            }
    return true;
}


