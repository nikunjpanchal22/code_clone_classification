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


 public static boolean hasLoop(Node root) {
    if (root == null) return false;
    Node anchor = root;
    Node diver = root.next;

    while (diver != null && diver.next != null) {
        if (anchor == diver || anchor == diver.next) {
            return true;
        } else {
            anchor = anchor.next;
            diver = diver.next.next;
        }
    }
    return false;
}


