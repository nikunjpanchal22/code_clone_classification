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


// Implementation 1 
Node reverse (Node n, Node p) {
    if (n == null) {
      return null;
    }
    Node current = n;
    Node prev = p;
    Node next;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current; 
        current = next;
    }
    n = prev;
    return n;
}


