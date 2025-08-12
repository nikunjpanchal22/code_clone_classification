public Key secondMaxKey () {
    if (size () < 2) {
        return null;
    }
    Node max = null;
    Node max_2 = null;
    Node second = first.next;
    if (first.key.compareTo (second.key) > 0) {
        max = first;
        max_2 = second;
    } else {
        max = second;
        max_2 = first;
    }
    for (Node x = second.next;
    x != null; x = x.next) {
        if (x.key.compareTo (max.key) > 0) {
            max_2 = max;
            max = x;
        } else if ((x.key.compareTo (max_2.key) > 0) && (x.key.compareTo (max.key) < 0)) {
            max_2 = x;
        }
    }
    return max_2.key;
}


  public Key secondMaxKey () {
    int size = size();
    if (size < 2) {
        return null;
    }
    Node current = first;
    Key max = first.key;
    Key second = first.next.key;
    if (max.compareTo (second) < 0) {
        Key temp = max;
        max = second;
        second = temp;
    }
    for (Node x = second.next; x != null; x = x.next) {
        Key currKey = x.key;
        if (currKey.compareTo(max) > 0) {
            second = max;
            max = currKey;
        }
        else if (currKey.compareTo(max_2.key) > 0 && currKey.compareTo(max.key) != 0) {
            second = currKey;
        }
    }
    return second;
}


