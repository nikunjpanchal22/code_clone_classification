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
    using (var reader = XmlReader.Create (st, new XmlReaderSettings() {ConformanceLevel = ConformanceLevel.Fragment}))
    {
        int elementCount = 0;
        while (reader.Read()) {
            if (reader.NodeType == XmlNodeType.Element && reader.Depth == 0) 
                elementCount++;
        }
        if (elementCount == 1)
            return true;
    }
    return false;
}


