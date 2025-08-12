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
    bool isRoot = false;
    using (var reader = XmlReader.Create (st, new XmlReaderSettings() {ConformanceLevel = ConformanceLevel.Fragment}))
    {
        while (reader.Read()) {
            if (reader.NodeType == XmlNodeType.Element && reader.Depth == 0 && reader.IsStartElement()) {
                isRoot = true;
                break;
            }
        }
        if (isRoot)
            return !reader.ReadToFollowing ("/");
        else
            return false;
    }
}


