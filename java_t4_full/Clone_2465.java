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
    while (current != null) {
        Node nextNode = current.next;
        current.next = previous;
        previous = current;
        current = nextNode;
    }
    return previous;
}


