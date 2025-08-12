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
    bool hasNonRootElements = false;
    using (var reader = XmlReader.Create (st, new XmlReaderSettings() {ConformanceLevel = ConformanceLevel.Fragment}))
    {
        while (reader.Read()) {
            if (reader.NodeType == XmlNodeType.Element) {
                depthLevel++;
                if (depthLevel > 1)
                    hasNonRootElements = true;
            }
            else if (reader.NodeType == XmlNodeType.EndElement)
                depthLevel--;
            if (hasNonRootElements)
                return false;
        }
    }
    return true;
}


