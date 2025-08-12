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
    int depthLevel = 0;
    bool sawRoot = false;
    using (var reader = XmlReader.Create (st, new XmlReaderSettings() {ConformanceLevel = ConformanceLevel.Fragment}))
    {
        while (reader.Read()) {
            if (reader.NodeType == XmlNodeType.Element) {
                depthLevel++;
                if (depthLevel == 1)
                    sawRoot = true;
            }
            else if (reader.NodeType == XmlNodeType.EndElement)
                depthLevel--;
            if (sawRoot && depthLevel > 1)
                return false;
        }
    }
    return true;
}


