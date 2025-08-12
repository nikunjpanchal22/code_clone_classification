public K remove () {
    if (head == null) return null;
    K val = head.value;
    if (head.next == null) {
        head = null;
        tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    return val;
}





public K remove() {
    if (head == null) return null;
    K val = head.value;
    if (head.next != null) {
        head.next.prev = null;
        head = head.next;
    } else {
        head = tail = null;
    }
    return val;
}


