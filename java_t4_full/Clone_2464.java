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





Node reverse(Node head, Node prev) {
    Node temp;
    while (head != null) {
        temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
    }
    return prev;
}


