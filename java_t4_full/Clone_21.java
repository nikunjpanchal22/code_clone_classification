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


 Node reverseLinkedList(Node head) {
    if (head == null || head.next == null)
        return head;
 
    Node next = head.next;
    head.next = null;
 
    Node rest = reverseLinkedList(next);
    next.next = head;
 
    return rest;
}


