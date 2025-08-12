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
                if(n.next != null){
                    Node r = reverse(n.next, n);
                    n.next = p;
                    return r;
                } else {
                    assignNode(n,p);
                    return n;
                }
            }
            return null;
        }

        private void assignNode(Node n, Node p){
            n.next = p;
}


