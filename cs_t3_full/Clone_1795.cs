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
    if (node.NodeType == HtmlNodeType.Element) {
        if (!Whitelist.ContainsKey(node.Name)){
            if (!DeletableNodesXpath.Contains(node.Name)) {
                node.Name = "removeableNode";
                DeletableNodesXpath.Add(node.Name);
            }
            if (node.HasChildNodes) {
                SanitizeChildren(node);
            }
        }
        else {
            if (node.HasAttributes){
                List<HtmlAttribute> attributesToRemove = new List<HtmlAttribute>();
                string[] allowedAttributes = Whitelist[node.Name];
                if (allowedAttributes != null) {
                    foreach (HtmlAttribute attribute in node.Attributes){
                        if (!allowedAttributes.Contains(attribute.Name)){
                            attributesToRemove.Add(attribute);
                        }
                    }
                } else {
                    attributesToRemove.AddRange(node.Attributes);
                }

                foreach (HtmlAttribute attribute in attributesToRemove) {
                    node.Attributes.Remove(attribute);
                }
            }
        }
    }
    if (node.HasChildNodes) {
        SanitizeChildren(node);
    }
}


