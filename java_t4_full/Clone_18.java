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


 Node reverseLinkedListIter(Node head) {
    // Initialize current, previous and
    // next pointers
    Node current = head;
    Node prev = null, next = null;
 
    while (current != null) {
        // Store next
        next = current.next;
 
        // Reverse current node's pointer
        current.next = prev;
 
        // Move pointers one position ahead.
        prev = current;
        current = next;
    }
    head = prev;
    return head;
}


