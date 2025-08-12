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



private static void PurifyNode (HtmlNode node) {
	    if (!IsNodeNull(node) && NodeIsElement(node)) {
		if (! WhiteListContains(node.Name) && ! DeletionListContains(node.Name)) {
		    AssignNodeRemovable(node);
		    if (ChildNodesExist(node)) PurifyChildNodes (node);
		    return;
		}
		if (AttributesExistInNode(node)) HandleNodeAttributes(node);
	    }
	    else if (ChildNodesExist(node)) PurifyChildNodes (node);
}


