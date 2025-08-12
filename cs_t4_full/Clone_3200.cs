public void add (object entry) {
    node newNode = new node (entry);
    if (headNode == null)
        headNode = newNode;
    if (tailNode != null)
        tailNode.next = newNode;
    tailNode = newNode;
    ++ node_count;
}





public void add (Object entry) {
    Node newNode = new Node (entry, null);
    if (headNode == null) {
        headNode = newNode;
    } else {
        Node tempNode = headNode;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }
    ++ node_count;
}


