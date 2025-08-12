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


// Implementation 10
Node reverse(Node n, Node p) {
    if(n == null)
        return null ;
    Node first = n;
    Node rest = n.next;
    Node current = n;
    if(rest == null)
        return n;
    Node next ;
    while(current != null){
        next = current.next ;
        current.next = p ;
        p = current;
        current = next;
    }
    first = p ;
    return first;
}


