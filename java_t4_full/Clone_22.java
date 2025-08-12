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


 Node reverseLinkedListRec(Node head) {
    if (head == null || head.next == null)
        return head;
 
    // get second node    
    Node second = head.next;
 
    // set first's next to null
    head.next = null;
 
    Node rest = reverseLinkedListRec(second);
 
    // put first element at the end of the list
    second.next = head;
 
    return rest;
}


