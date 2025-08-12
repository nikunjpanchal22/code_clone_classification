public ListNode reverse (ListNode toBeNextNode, ListNode currentNode) {
    ListNode currentHead = currentNode;
    if ((currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;
    if (currentNode.next != null) currentHead = reverse (currentNode, currentNode.next);
    currentNode.next = toBeNextNode;
    return currentHead;
}


 public DListNode reverse (DListNode toBeNextNode, DListNode currentNode) {
    DListNode currentHead = currentNode;
    if((currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;
    if (currentNode.next != null) currentHead = reverse(currentNode, currentNode.next);
    currentNode.next = toBeNextNode;
    return currentHead;
}
