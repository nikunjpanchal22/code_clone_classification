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
            return (n == null) ? null : (n.next == null) ? n : returnNode(n, p);
        }

        Node returnNode(Node n, Node p){
            n.next = p;
            return reverse (n.next, n);
}


