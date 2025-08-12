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


// Implementation 2
Node reverse (Node n, Node p) {
    if (n == null) return null;

    if (n.next == null) {
        n.next = p;
        return n;
    }
    
    Node nextNode = n.next;
    n.next = p;
    p = n;
    n = nextNode;
    return reverse(n, p);
}


