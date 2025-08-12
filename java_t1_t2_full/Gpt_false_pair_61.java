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


  public Node reverse (Node previous, Node current) {
    //check for null
    if (previous == null) return null;
    //check if at the head
    if (previous.equals(head)) previous.setNext(null);
    //check for end of list
    if (current == null) {
        head = previous;
        return head;
    }
    //save next node
    Node temp = current.getNext();
    //reverse the links
    current.setNext(previous);
    //recursive call
    reverse(current, temp);
    return null;
}
