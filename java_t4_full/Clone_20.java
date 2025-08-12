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


 Node reverseLinkedListNov(Node head)
{
    if (head == null || head.next == null)
        return head;
 
    Node secondElem = head.next;
 
    // reverse the rest list and put the first element at the end
    Node rest = reverseLinkedListNov(secondElem);
    secondElem.next = head;
 
    // tricky step -- see the diagram
    head.next = null;
 
    // fix the head pointer
    return rest;
}


