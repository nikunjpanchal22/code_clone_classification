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



static bool IsXmlRooted (Stream st) {
    bool sawRoot = false;
    var xmlReaderSettings = new XmlReaderSettings() {ConformanceLevel = ConformanceLevel.Fragment};
    var reader = XmlReader.Create(st, xmlReaderSettings);
    while (reader.Read())
        if (reader.NodeType == XmlNodeType.Element && reader.Depth == 0 && !sawRoot)
            sawRoot = true;
        else if (reader.NodeType == XmlNodeType.Element && reader.Depth == 0 && sawRoot)
            return false;
    return true;
}


