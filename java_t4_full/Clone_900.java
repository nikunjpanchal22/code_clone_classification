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
    Node active = root;
    Node inactive = root.next;

    while (inactive != null && inactive.next != null) {
        if (active == inactive || active == inactive.next) {
            return true;
        } else {
            active = active.next;
            inactive = inactive.next.next;
        }
    } 
    return false;
}


