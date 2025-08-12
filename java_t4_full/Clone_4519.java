public static boolean hasLoop (Node root) {
    if (root == null) return false;
    Node slow = root, fast = root;
    int taken = 0, limit = 2;
    while (fast.next != null) {
        fast = fast.next;
        taken ++;
        if (slow == fast) return true;
        if (taken == limit) {
            taken = 0;
            limit <<= 1;
            slow = fast;
        }
    }
    return false;
}




public static boolean hasLoop (Node root) {
    if (root == null || root.next == null) 
        return false;
    Node slowPointer = root;
    Node fastPointer = root;

    while (slowPointer.next != null && fastPointer.next != null && fastPointer.next.next != null) {
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
        if (slowPointer == fastPointer) 
            return true;
    }
    return false;
}


