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
    Node currentNode = new Node(entry);
    if (headNode == null) {
        headNode = tailNode = currentNode; 
    } else {
        Node iterator = headNode;
        while(iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = currentNode;
        tailNode = currentNode;
    }
    node_count++;
}


