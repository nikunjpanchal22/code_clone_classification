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


  public Node reverse(Node prev, Node curr) {
    if(prev == null) return null;
    if(prev.equals(head)) prev.setNext(null);
    if(curr == null) {
        head = prev;
        return head;
    }
    Node tmp = curr.getNext();
    curr.setNext(prev);
    reverse(curr, tmp);
    return null;
}
