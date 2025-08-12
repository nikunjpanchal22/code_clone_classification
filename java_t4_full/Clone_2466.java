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
        return reverseUtil(node, prev)[0];
    }

    Node[] reverseUtil(Node node, Node prev) {
        if (node == null) return new Node[]{prev};
        Node[] nodes = reverseUtil(node.next, node);
        node.next = prev;
        return nodes;
}


