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


 Node iterativeReverse(Node n) {
    if (n == null) 
        return null;
 
    Node curr = n;
    Node prev = null;
 
    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
 
    return prev;
} 


