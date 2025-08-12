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
    List<Node> list = new ArrayList<>();
    while (head != null) {
        list.add(head);
        head = head.next;
    }
    Collections.reverse(list);
    Node first = list.get(0);
    for (int i = 1; i < list.size(); i++) {
        list.get(i - 1).next = list.get(i);
    }
    list.get(list.size() - 1).next = null;
    return first;
}


