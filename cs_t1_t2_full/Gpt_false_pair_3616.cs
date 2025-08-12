public void GenereateSettingsFile (List < Node > nodeList, string filePath) {
    _rootNode.RemoveChild (_userNode);
    _userNode = _xmlDoc.CreateElement ("Display_Settings");
    _rootNode.AppendChild (_userNode);
    foreach (Node n in nodeList) {
        foreach (XmlElement e in n.GenerateXML (_xmlDoc)) {
            _userNode.AppendChild (e);
        }
    }
    _xmlDoc.Save (filePath);
}


public void CreateSettingsFile (List<Node>nodeList, string filePath) {
    _rootNode.RemoveChild(_userNode);
    _userNode = _xmlDoc.CreateElement("Display_Settings");
    _rootNode.AppendChild(_userNode);
    foreach (Node n in nodeList) {
        foreach (XmlElement element in n.MakeXML(_xmlDoc)) {
            _userNode.AppendChild(element);
        }
    }
    _xmlDoc.Save(filePath);
}
