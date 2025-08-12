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



Node reverse (Node n, Node p) {
    if (n == null || n.next == null) {
        if(n != null)
            n.next = p;
        return n;
    }else {
        Node r = reverse(n.next, n);
        n.next = p;
        return r;
    }
}


