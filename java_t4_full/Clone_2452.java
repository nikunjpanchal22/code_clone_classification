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



Node reverse (Node n, Node p) {
    if (n != null) {
        Node r = (n.next != null) ? reverse(n.next, n) : n;
        n.next = p;
        return r;
    }
    return null;
}


