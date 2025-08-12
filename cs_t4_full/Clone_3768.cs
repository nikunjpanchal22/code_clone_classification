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
    bool sawRoot = false;
    try {
        var settings = new XmlReaderSettings(){ConformanceLevel = ConformanceLevel.Fragment};
        using(XmlReader reader = XmlReader.Create(stream, settings)) {
            while(reader.Read())
                if (reader.NodeType == XmlNodeType.Element && reader.Depth == 0)
                    if (sawRoot) return false;
                    else sawRoot = true;
        }
    }
    catch {
        throw;
    }
    return true;
}


