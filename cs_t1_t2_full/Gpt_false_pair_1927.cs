public static HtmlNode TruncateInnerText (HtmlNode node, int length) {
    if (node == null)
        throw new ArgumentNullException ("node");
    if (node.InnerText.Length < length)
        return node;
    HtmlNode clone = node.CloneNode (false);
    TruncateInnerText (node, clone, clone, length);
    return clone;
}



 public static HtmlNode TruncateInnerText(HtmlNode node, int length) 
{ 
    if (node == null) 
        throw new ArgumentNullException("node"); 
    HtmlNode clone = node.CloneNode(false); 
    int currentLength = node.InnerText.Length; 
    if (currentLength < length) 
        return node; 
    TrimInnerText(node, clone, clone, length); 
    return clone; 
}   


 public static HtmlNode TruncateInnerText (HtmlNode node, int length) 
{ 
    if (node == null) 
        throw new ArgumentNullException ("node"); 
    if (node.InnerText.Length < length) 
        return node; 
    HtmlNode clone = node.CloneNode (false); 
    clipInnerText(node, clone, clone, length); 
    return clone; 
} 
