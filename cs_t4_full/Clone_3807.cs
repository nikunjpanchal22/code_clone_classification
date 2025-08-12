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



private static void CleanHtmlNode (HtmlNode node) {
	    if (node != null && IsElementType(node)) {
		if (!IsWhitelisted(node.Name) && !IsDeletable(node.Name)) {
		    MarkAsDeletable(node);
		    if (node.HasChildNodes)  SanitizeNodes (node);
		    return;
		}
		if (HasAttributes(node))  CleanNodeAttributes(node);
	    }
	    else if (DoesNodeHaveChildren(node))  SanitizeNodes (node);
}


