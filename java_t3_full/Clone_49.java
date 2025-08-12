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
    if (curr == null) 
    { 
        head = prev; 
        return head; 
    } 
  
    Node nextNode = curr.getNext(); 
    curr.setNext(prev); 
    prev = curr; 
    curr = nextNode; 
  
    return reverse(prev, curr); 
} 


