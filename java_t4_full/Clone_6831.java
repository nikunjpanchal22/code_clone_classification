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
    Node<E> current = head;
    while (current != null) {
        if (current.data.equals(element)) {
            if (head.data.equals(element)) {
                head = head.next;
            } else {
                current.prev.next = current.next;
            }
            System.out.println("Element " + element + " removed.");
            return;
        }
        current = current.next;
    }
    System.out.println("Element " + element + " not found.");
}


