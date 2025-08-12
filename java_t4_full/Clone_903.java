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
    Node tartget = root;
    Node detour = root.next;

    while (detour != null && detour.next != null) {
        if (tartget == detour || tartget == detour.next) {
            return true;
        } else {
            tartget = tartget.next;
            detour = detour.next.next;
        }
    }
    return false;
}


