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





Node reverse(Node head, Node prev) {
    Stack<Node> stack = new Stack<>();
    while (head != null) {
        stack.push(head);
        head = head.next;
    }
    head = stack.pop();
    while (!stack.empty()) {
        head.next = stack.pop();
        head = head.next;
    }
    head.next = null;
    return head;
}


