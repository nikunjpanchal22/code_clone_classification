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
    if (root == null) return false;
    Node turtle = root, hare = root;
    while (hare != null && hare.next != null) {
        turtle = turtle.next;
        hare = hare.next.next;
        if (turtle == hare) return true;
    }
    return false;
}


