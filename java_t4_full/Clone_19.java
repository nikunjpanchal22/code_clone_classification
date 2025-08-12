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


 Node reverseList(Node head) {
    Node prevNode = null;
 
    while(head != null) {
      Node nextNode = head.next;
      head.next = prevNode;
      prevNode = head;
      head = nextNode;
    }
 
    return prevNode;
}


