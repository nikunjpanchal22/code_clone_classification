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
    if (headNode != null) {
        tailNode.next = newNode;
    } else{
        headNode = newNode;
    }
    tailNode = newNode;
    node_count++;
}


