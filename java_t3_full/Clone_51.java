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


// Implementation 8
Node reverse (Node n, Node p) {
    if (n == null) return null;
    if (n.next == null) { 
        n.next = p; 
        return n; 
    } 
  
    Node next = n.next; 
    n.next = p; 
  
    return reverse(next, n); 
}


