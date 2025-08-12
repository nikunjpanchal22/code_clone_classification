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
    if (_userNode !=null) {
        _rootNode.ChildNodes.Remove(_userNode);
    }

    _userNode = _xmlDoc.CreateElement("Display_Settings");
    _rootNode.AppendChild(_userNode);

    for (int i=0; i < nodeList.Count; i++)
    {
        Node n = nodeList[i];
        _userNode.AppendChild(n.GenerateXML(_xmlDoc));
    }

    _xmlDoc.Save(filePath);
}


