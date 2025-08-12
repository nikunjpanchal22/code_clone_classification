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
        return val;
    }
 
    head = head.next;
    head.prev = null;
    Node temp = head.prev; // delete head's previous node
    temp.next = null;
    temp.prev = null;
    return val;
}


