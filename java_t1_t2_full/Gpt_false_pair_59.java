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
    //Base case
    if(prev == null) return null;
    //Check for head
    if(prev.equals(head)) prev.setNext(null);
    //Check for end of list
    if(curr == null) {
        head = prev;
        return head;
    } 
    //Save next node
    Node tmp = curr.getNext();
    //Reverse link 
    curr.setNext(prev);
    //Recursive
    reverse(current, tmp);
    return null;
}
