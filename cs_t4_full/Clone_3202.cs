public void add (object entry) {
    node newNode = new node (entry);
    if (headNode == null)
        headNode = newNode;
    if (tailNode != null)
        tailNode.next = newNode;
    tailNode = newNode;
    ++ node_count;
}





public void add(Object entry) {
    if(headNode == null) {
        headNode = new Node(entry);
        tailNode = headNode;
    } else {
        Node newNode = new Node(entry);
        tailNode.next = newNode;
        tailNode = newNode;
    }
    node_count++;
}


