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
    if (headNode == null)
        headNode = newNode;
    else {
        Node currentNode = headNode;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    tailNode = newNode;
    node_count++;
}


