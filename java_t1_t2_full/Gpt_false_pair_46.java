public ListNode reverse (ListNode toBeNextNode, ListNode currentNode) {
    ListNode currentHead = currentNode;
    if ((currentNode == null || currentNode.next == null) && toBeNextNode == null) return currentHead;
    if (currentNode.next != null) currentHead = reverse (currentNode, currentNode.next);
    currentNode.next = toBeNextNode;
    return currentHead;
}


 public BinarySearchTreeNode reverse (BinarySearchTreeNode toBeNextNode, BinarySearchTreeNode currentNode) {
    BinarySearchTreeNode currentHead = currentNode;
    if ((currentNode == null || currentNode.left == null) && toBeNextNode == null) return currentHead;
    if (currentNode.left != null) currentHead = reverse (currentNode, currentNode.left);
    currentNode.left = toBeNextNode;
    return currentHead;
}
