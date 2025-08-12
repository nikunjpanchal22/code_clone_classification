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
    if (n == null) return p;
    Node nextNode = n.next;
    n.next = p;
    return (nextNode != null) ? reverse(nextNode, n) : n;
}


