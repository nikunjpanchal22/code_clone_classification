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
    newNode.next = null;
    if(headNode == null) {
        headNode = newNode;
    }
    else {
        Node last = headNode;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    node_count++;
}


