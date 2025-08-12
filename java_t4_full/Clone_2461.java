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
    Deque<Node> stack = new ArrayDeque<>();
    while (node != null) {
        stack.push(node);
        node = node.next;
    }
    node = stack.pop();
    while (!stack.isEmpty()) {
        node.next = stack.pop();
        node = node.next;
    }
    node.next = null;
    return node;
}


