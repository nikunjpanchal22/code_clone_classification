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





Node reverse(Node current, Node previous) {
    if (current == null) return previous;
    Node nextNode = current.next;
    current.next = previous;
    return reverse(nextNode, current);
}


