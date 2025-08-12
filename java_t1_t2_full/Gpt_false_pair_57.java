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
    //check for null
    if (previous == null) return null;
    //check to see if first element
    if (previous.equals(head)) previous.setNext(null);
    //check to see if reached the end 
    if (current == null) {
        head = previous;
        return head;
    }
    //Save next node
    Node temp = current.getNext();
    //Reverse current value
    current.setNext(previous);
    //Recursive call
    reverse(current, temp);
    return null;
}
