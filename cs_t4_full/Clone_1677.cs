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


 public void GenerateSettingsFile (List < Node > nodeList, string filePath) {
    _rootNode.ReplaceChild(null, _userNode);
    _userNode = _xmlDoc.CreateElement("Display_Settings");
    _rootNode.AppendChild(_userNode);
    nodeList.ForEach(n => n.GenerateXML(_xmldoc).ForEach(_userNode.AppendChild));
    _xmlDoc.Save(filePath);
}


