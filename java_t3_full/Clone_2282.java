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
    if(previous.equals (head)) previous.setNext (null);
    if (null == current) {
        head = previous;
    } else {
        Node next_node = current.getNext();
        current.setNext(previous);
        reverse(current, next_node);
    }
    return head;
}


