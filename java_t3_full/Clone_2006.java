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
    if (head==null) {
        return null;
    }
 
    K val = head.value;
 
    if (head.next == null) {
        head = null;
        tail = null;
    } else {
        Node second = head.next;
        second.prev=null;
        head.next=null;
        head=second;
    }
    return val;
}


