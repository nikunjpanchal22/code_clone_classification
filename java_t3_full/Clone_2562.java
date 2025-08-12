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




public Key secondMaxKey() {
    if(size() < 2) return null;
    Node previous = null;
    Node current = null;
    if (first.key.compareTo(first.next.key) > 0) {
        current = first;
        previous = first.next;
    } else {
        current = first.next;
        previous = first;
    }
    for (Node i = first.next.next; i != null; i = i.next) {
        if (i.key.compareTo(current.key) > 0) {
            previous = current;
            current = i;
        } else if ((previous == null) || (i.key.compareTo(previous.key) > 0)) {
            previous = i;
        }
    }
    return previous.key;
}


