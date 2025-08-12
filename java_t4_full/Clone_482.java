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
    if (size () < 2) {
        return null;
    }

    Node max = first;
    Node second = first.next;
    int results = first.key.compareTo(second.key);

    if (results < 0) {
        Node temp = max;
        max = second;
        second = temp;
    }

    while (second.next != null) {
        Node temp = second.next;
        int res = temp.key.compareTo(max.key);
        if  (res > 0) {
            second = max;
            max = temp;
        } else if (temp.key.compareTo(second.key) > 0 && temp.key.compareTo(max.key) < 0 ) {
            second = temp;
        }
        second = second.next;
    }

    return second.key;
}


