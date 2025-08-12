public Node reverse (Node previous, Node current) {
    if (previous == null) return null;
    if (previous.equals (head)) previous.setNext (null);
    if (current == null) {
        head = previous;
        return head;
    } else {
        Node temp = current.getNext ();
        current.setNext (previous);
        reverse (current, temp);
    }
    return null;
}


public Node reverse (Node first, Node second) {
    if (first == null) return null;
    if (first.equals (head)) first.setNext (null);
    if (second == null) {
        head = first;
        return head;
    } else {
        Node temp = second.getNext ();
        second.setPrevious (first);
        reverse (second, temp);
    }
    return null;
}
