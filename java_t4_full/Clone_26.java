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


// Implementation 6
Node reverse (Node n, Node p) {
    if (n == null) return null;
    if (n.next == null) {
        n.next = p;
        return n;
    }
    Node head = n;
    Node prev = null;
    while(head.next != null)
    {
        prev = head;
        head = head.next;
    }
    head.next = n;
    prev.next = null;  
    return reverse(n.next, head);
}


