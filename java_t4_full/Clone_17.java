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


 Node reverseList(Node head){
    Node curr = head;
    Node prev = null;
    while(curr!=null)
    {
        Node next  = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head= prev;
    return head;
}


