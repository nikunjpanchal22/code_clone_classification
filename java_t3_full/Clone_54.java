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
    //return null if head is null
    if(prev==null) {
        return null;
    }
    //set the next of head to be null
    if(prev.equals(head)) {
       prev.setNext(null); 
    }
    //reached the end
    if(curr == null) {
        head = prev;
        return head;
    }
    //saves the next node of curr
    Node temp = curr.getNext();
    //re-assign the next of curr
    curr.setNext(prev);
    //call the function to reverse
    reverse(curr, temp);
    return null;
}


