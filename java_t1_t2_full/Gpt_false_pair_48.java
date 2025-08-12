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
    if (previous == null) 
        return null;
    if (previous.equals(head))
        previous.setNext(null);
 
    if (current == null)
    { 
        head=previous; 
        return head;
    }
    else 
    {
        //Store the next node
        Node temp = current.getNext(); 
        //Set the next of current to its prev node 
        current.setNext(previous); 
        //Set the prev node to the current node
        previous = current; 
        //Move the curr node to the next  
        current = temp; 
        //Recursive call
        reverse(previous,current);
    }
    return null;
}
