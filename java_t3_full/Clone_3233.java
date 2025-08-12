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
    Node nextNode = head.next;
    if (nextNode != null) {
        nextNode.prev = null;
        head = nextNode;   
    } else {
        head = null;
        tail = null;
    }
    return val;
}


