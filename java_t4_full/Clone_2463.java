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





Node reverse(Node current, Node prev) {
    Node first = current;
    Node second = prev;
    while (first != null) {
        Node temp = first.next;
        first.next = second;
        second = first;
        first = temp;
    }
    return second;
}


