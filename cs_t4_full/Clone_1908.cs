private static void SanitizeNode (HtmlNode node) {
    if (node.NodeType == HtmlNodeType.Element) {
        if (! Whitelist.ContainsKey (node.Name)) {
            if (! DeletableNodesXpath.Contains (node.Name)) {
                node.Name = "removeableNode";
                DeletableNodesXpath.Add (node.Name);
            }
            if (node.HasChildNodes) {
                SanitizeChildren (node);
            }
            return;
        }
        if (node.HasAttributes) {
            for (int i = node.Attributes.Count - 1; i >= 0; i --) {
                HtmlAttribute currentAttribute = node.Attributes [i];
                string [] allowedAttributes = Whitelist [node.Name];
                if (allowedAttributes != null) {
                    if (! allowedAttributes.Contains (currentAttribute.Name)) {
                        node.Attributes.Remove (currentAttribute);
                    }
                } else {
                    node.Attributes.Remove (currentAttribute);
                }
            }
        }
    }
    if (node.HasChildNodes) {
        SanitizeChildren (node);
    }
}


 private static void SanitizeNode (HtmlNode node) 
{
    if (node.NodeType == HtmlNodeType.Element) 
    {
        if (Whitelist.ContainsKey(node.Name)) 
        {
            if (node.HasAttributes) 
            {
                List<int> indexToRemoveList = new List<int>();
                string [] allowedAttributes = Whitelist[node.Name];
                if (allowedAttributes != null){
                    for (int i = 0; i < node.Attributes.Count; i++) 
                    {
                        HtmlAttribute currentAttribute = node.Attributes[i];
                        if (!allowedAttributes.Contains(currentAttribute.Name)) 
                        {
                            indexToRemoveList.Add(i);
                        }
                    }
                    for (int i = 0; i < indexToRemoveList.Count; i++)
                    {
                        node.Attributes.RemoveAt(indexToRemoveList[i] - i);
                    }
                } else {
                    for (int i = 0; i < node.Attributes.Count; i++) 
                    {
                        HtmlAttribute currentAttribute = node.Attributes[i];
                        node.Attributes.RemoveAt(i);
                    }
                }
            }
        } 
        else 
        {
            if (!DeletableNodesXpath.Contains(node.Name)) 
            {
                node.Name = "removeableNode";
                DeletableNodesXpath.Add(node.Name);
            }
            if (node.HasChildNodes) 
            {
                SanitizeChildren(node);
            }
            return;
        }
    }
    if (node.HasChildNodes) 
    {
        SanitizeChildren(node);
    }
}


