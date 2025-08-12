public void add (object entry) {
    node newNode = new node (entry);
    if (headNode == null)
        headNode = newNode;
    if (tailNode != null)
        tailNode.next = newNode;
    tailNode = newNode;
    ++ node_count;
}


     public void add(object entry) {  
        Node newNode = new Node(entry);  
        if (headNode == null) {  
            headNode = newNode;  
        }  
        Node lastNode = headNode;  
        while (lastNode.next != null) {  
            lastNode = lastNode.next;  
        }  
        lastNode.next = newNode;  
        tailNode = newNode;  
        node_count++;  
}


