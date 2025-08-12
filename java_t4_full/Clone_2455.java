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
            if (n != null) {
                return (n.next != null) ? reverse(n.next, n, assignNextNode(n,p)): n; 
            }
            return null; 
        }

        private Node assignNextNode(Node n, Node p){
            n.next = p;
            return n;
}


