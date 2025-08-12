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
    Node n = head;
    Node prior = null;
    while (n != null && !n.data.equals (element)) {
        prior = n;
        n = n.previous;
    }
    if (n == null) {
        System.out.println ("Element " + element + " not found.");
    } else {
        if (prior == null) {
            head = n.previous;
        } else {
            prior.previous = n.previous;
        }
        n.previous = null;
        System.out.println ("Element " + element + " removed.");
    }
}


