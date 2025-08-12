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
 
    Node temp = head;
    head = head.next;
    head.prev = null;
    temp.prev = null; // deallocating memory
    temp.next = null;
    return val;
}


