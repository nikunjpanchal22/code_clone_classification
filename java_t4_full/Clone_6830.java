public void remove (E element) {
    Node n = head;
    Node tmp;
    while (n != null && ! n.data.equals (element)) {
        tmp = n;
        n = n.previous;
    }
    if (n == null) {
        System.out.println ("Element " + element + " not found.");
    } else {
        tmp.prev = n.prev;
        n.prev = null;
        System.out.println ("Element " + element + " removed.");
    }
}




public void remove (E element) {
    if (head == null) {
        System.out.println("Element " + element + " not found.");
        return;
    }
    if (head.data.equals (element)) {
        head = head.next;
        System.out.println("Element " + element + " removed.");
        return;
    }
    Node n = head;
    while (n.next != null) {
        if (n.next.data.equals(element)) {
            n.next = n.next.next;
            System.out.println("Element " + element + " removed.");
            return;
        }
        n = n.next;
    }
    System.out.println("Element " + element + " not found.");
}


