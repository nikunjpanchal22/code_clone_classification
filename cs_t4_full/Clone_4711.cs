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
    Node newNode = new Node(entry);
    if (headNode == null) {
        headNode = newNode;
        tailNode = headNode;
    } else {
        // Link the new node to tail node
        tailNode.next = newNode;
        // Update the tail node to new node
        tailNode = newNode;
    }
    node_count++;
}


