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


 public void remove(E element) {
    Node prev = null;
    Node tmp = head;
    while (tmp != null && !tmp.data.equals(element)) {
        prev = tmp;
        tmp = tmp.previous;
    }
    if (tmp == null) {
        System.out.println("Element " + element + " not found.");
    } else {
        if (prev != null) {
            prev.previous = tmp.previous;
        } else {
            head = tmp.previous;
        }
        tmp.previous = null;
        System.out.println("Element " + element + " removed.");
    }
}


