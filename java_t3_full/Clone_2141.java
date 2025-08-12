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
    Node prev = null;
    Node curr = head;
    Node tmp;
    while (curr != null && !curr.data.equals(element)) {
        tmp = curr;
        curr = curr.previous;
        prev = tmp;
    }
    if (curr == null) {
        System.out.println("Element " + element + " not found.");
    } else {
        if (prev == null) {
            head = curr.previous;
        } else {
            prev.previous = curr.previous;
        }
        curr.previous = null;
        System.out.println("Element " + element + " removed.");
    }
}


