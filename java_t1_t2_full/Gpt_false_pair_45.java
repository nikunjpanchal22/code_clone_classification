public ListNode reverse (ListNode toBeNextNode, ListNode currentNode) {
    ListNode currentHead = currentNode;
    if ((currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;
    if (currentNode.next != null) currentHead = reverse (currentNode, currentNode.next);
    currentNode.next = toBeNextNode;
    return currentHead;
}


 public BSTNode reverse (BSTNode toBeNextNode, BSTNode currentNode) {
    BSTNode currentHead = currentNode;
    if ((currentNode == null || currentNode.right == null) && toBeNextNode == null) return currentHead;
    if (currentNode.right != null) currentHead = reverse (currentNode, currentNode.right);
    currentNode.right = toBeNextNode;
    return currentHead;
}
