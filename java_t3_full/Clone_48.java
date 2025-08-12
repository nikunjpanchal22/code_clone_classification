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


  public Node reverse (Node prev, Node curr)
{
    // base case
    if (curr == null) 
    {
        head = prev;
        return head;
    }
    
    // store the next node
    Node temp = curr.getNext();
    // set the next of current to its prev node
    curr.setNext(prev);
    // new prev node is now current
    prev = curr;
    // move curr node to the next
    curr = temp;
    // recursive call
    reverse(prev, curr);
    
    return null;
}


