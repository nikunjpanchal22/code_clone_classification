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
    //Create a new node
    Node node = new Node(entry);
    
    //if the list is empty, make the new node head and tail
    if(headNode == null) {
        headNode = node;
        tailNode = node;
    }
    //otherwise, add the node to the end of the list
    else {
        tailNode.next = node;
        tailNode = tailNode.next;
    }
    node_count++;
}


