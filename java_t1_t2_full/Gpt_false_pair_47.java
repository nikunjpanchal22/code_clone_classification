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


 Node recursiveReverse(Node n, Node prev) {
    if (n == null) 
        return null;
    if (n.next == null) {
        n.next = prev;
        return n;
    }
    Node rev = recursiveReverse(n.next, n);
    n.next = prev;
    return rev;
}
