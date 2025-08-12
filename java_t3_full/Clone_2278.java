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





public Node reverse(Node previous, Node current) {
    boolean isPreviousNull = previous == null;
    boolean isPreviousHead = previous != null && previous.equals(head);
    boolean isCurrentNull = current == null;
    if (isPreviousNull) return null;
    if (isPreviousHead) previous.setNext(null);
    if (isCurrentNull) {
        head = previous;
        return head;
    } else {
        Node temp = current.getNext();
        current.setNext(previous);
        reverse(current, temp);
    }
    return null;
}


