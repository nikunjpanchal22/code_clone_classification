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
        Node temp = head.next;
        head.next = null;
        head = temp;
        head.prev = null;
    }
    return val;
}


