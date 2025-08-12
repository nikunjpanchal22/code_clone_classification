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


 Node reverseListRecursive(Node curr, Node prev) {
    if (curr == null)
        return prev;
 
    Node nextNode = curr.next;
    curr.next = prev;
 
    return reverseListRecursive(nextNode, curr);
}


