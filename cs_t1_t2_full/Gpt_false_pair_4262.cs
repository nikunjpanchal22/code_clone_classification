public void add (object entry) {
    node newNode = new node (entry);
    if (headNode == null)
        headNode = newNode;
    if (tailNode != null)
        tailNode.next = newNode;
    tailNode = newNode;
    ++ node_count;
}


public void add (object entry) {
    node newNode = new node (entry);
    node oldTailNode = tailNode;
    if (headNode == null)
        headNode = newNode;
    tailNode = newNode;
    if (oldTailNode != null)
        oldTailNode.next = tailNode;
    ++ node_count;
}
