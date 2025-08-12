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
    bool isRooted = false;
    int depthLevel = 0;
    using (var reader = XmlReader.Create (st, new XmlReaderSettings() {ConformanceLevel = ConformanceLevel.Fragment}))
    {
        while (reader.Read()) {
            switch (reader.NodeType) {
                case XmlNodeType.Element:
                    if (depthLevel > 0)
                        break;
                    isRooted = true;
                    depthLevel++;
                    break;
                case XmlNodeType.EndElement:
                    depthLevel--;
                    break;
            }
            if (depthLevel == 0 && !isRooted)
                return false;
        }
    }
    return isRooted;
}


