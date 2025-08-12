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
    if (head == null) {
        return null;
    }
 
    K val = head.value;
    if (head.next == null) {
        head = null;
        tail = null;
    } else {
        Node prev = head;
        head = head.next;
        prev.next = null;
        head.prev = null;
    }
    return val;
}


