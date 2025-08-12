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
            return n == null ? p : (n.next == null) ? reverseNode(n, p) : reverse(n.next, n, p);
        }

        void reverseNode(Node n, Node p){
            n.next = p;
}


