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
    Node current = head;
    while (current != null && !current.data.equals (element)) {
        prev = current;
        current = current.previous;
    } 
    if (current == null) {
        System.out.println("Element " + element + " not found.");   
    } else {
        if (prev == null) {
            head = current.previous;
        } else {
            prev.previous = current.previous;
        }
        current.previous = null;
        System.out.println("Element " + element + " removed.");
    }
}


