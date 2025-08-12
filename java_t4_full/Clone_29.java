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


// Implementation 4
Node reverse (Node n, Node p) {
    if (n == null) return null;
    
    Node head = n;
    Node prev = null;
    Node next;
    while (head != null) {
        next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    n = prev;
    return n;
}


