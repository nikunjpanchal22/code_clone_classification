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


 public Node reverse(Node prev, Node current) 
    {
        if(prev == null)
            return null;
        if(prev.equals(head))
            prev.setNext(null);
        if(current == null)
        {
            head = prev;
            return head;
        }
        else
        {
            Node temp = current.getNext();
            current.setNext(prev);
            reverse(current, temp);
        }
        return null;
    }

  public Node reverse (Node prev, Node curr) {
    //base case
    if (prev == null) return null;
 
    if (prev.equals(head)) 
        prev.setNext(null); //set the prev node next to null
 
    if (curr == null) {
        head = prev; 
        return head;
    }
    else{
        //move to the next node
        Node temp = curr.getNext(); 
        //set the curr node next to previous node
        curr.setNext(prev); 
        //move the prev node to current node
        prev = curr; 
        //move the curr node to the next node
        curr = temp; 
        //call recursively
        reverse(prev, curr);
    }
    return null;
}
