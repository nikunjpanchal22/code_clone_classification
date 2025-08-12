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
    Node runner1 = root;
    Node runner2 = root.next;

    while (runner2 !=null && runner2.next != null) {
        if (runner1 == runner2 || runner1 == runner2.next) {
            return true;
        } else {
            runner1 = runner1.next;
            runner2 = runner2.next.next;
        }
    } 
    return false;
}


