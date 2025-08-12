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
    if (previous == null) return null;
    if (previous.equals(head)) previous.setNext(null);
    Node temp = current == null ? null : current.getNext();
    if (temp != null) {
        current.setNext(previous);
        reverse(current, temp);
    } else {
        head = previous;
    }
    return head;
}


