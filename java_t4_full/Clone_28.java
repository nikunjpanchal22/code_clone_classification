Node reverse (Node n, Node p) {
    if (n == null) return null;
    if (n.next == null) {
        n.next = p;
        return n;
    }
    Node r = reverse (n.next, n);
    n.next = p;
    return r;
}


// Implementation 3
Node reverse (Node n, Node p) {
    if (n == null) return null;
    
    Node tail = n; 
    while (tail.next != null) { 
        tail = tail.next; 
    } 
  
    Node head = tail;  
  
    // seperate reverse logic 
    while(n != tail) { 
       Node logNext = n.next; 
       n.next = p;
       p = n;
       n = logNext;
    } 
    n.next = p;
    return head;
}


