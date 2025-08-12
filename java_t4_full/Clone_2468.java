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





Node reverse(Node node, Node prev) {
    return node == null ? prev : Stream
            .iterate(new Node[]{node, prev}, n -> new Node[]{n[0].next, n[0]})
            .dropWhile(n -> n[0] != null)
            .findFirst()
            .map(n -> n[1])
            .orElse(null);
}


