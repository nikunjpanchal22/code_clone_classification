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
    var readerSettings = new XmlReaderSettings {ConformanceLevel = ConformanceLevel.Fragment};
    var reader = XmlReader.Create(st, readerSettings);
    while (reader.Read()) {
        var condition = reader.NodeType == XmlNodeType.Element && reader.Depth == 0;
        if (sawRoot && condition) return false;
        if (condition) sawRoot = true;
    }
    return true;
}


