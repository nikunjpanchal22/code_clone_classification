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
    Node node = new Node(entry);
    if (headNode == null) {
        headNode = node;
    } else {
        Node current = headNode;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;
    }
    node_count++;
}


