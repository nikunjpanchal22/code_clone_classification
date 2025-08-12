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


// Implementation 9
Node reverse (Node n, Node p) {
    if (n == null) return null;

    Node first = n; 
    Node rest = first.next; 
  
    if (rest == null) 
        return n; 
  
    reverse(n.next,n); 
    first.next.next = first;
  
    first.next = null; 
    return n;       
}


