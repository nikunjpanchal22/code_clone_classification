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


 public static boolean hasLoop (Node root) 
{
    if (root == null) 
        return false;

    Node slow = root;
    Node fast = root;

    int taken = 0;
    int limit = 16;

    while (true) 
    {
        fast = fast.next;
        taken++;

        if (slow == fast) 
            return true;

        if (taken == limit)
        {
            taken = 0;
            limit *= 16;
            slow = fast;
        }

        if (fast == null)
            break;
    }
    
    return false;
}


