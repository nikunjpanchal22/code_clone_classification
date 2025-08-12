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


 public void GenereateSettingsFile (List < Node > nodeList, string filePath) {
    if(_userNode != null){
        _userNode.ParentNode.RemoveChild(_userNode);
    }

    _userNode = _xmlDoc.CreateElement("Display_Settings");
    _rootNode.AppendChild(_userNode);

    foreach (Node n in nodeList)
    {
        _userNode.AppendChild(n.GenerateXML(_xmlDoc));
    }

    _xmlDoc.Save(filePath);
}


