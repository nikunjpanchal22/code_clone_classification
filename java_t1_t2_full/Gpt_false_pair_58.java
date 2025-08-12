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
    //null check
    if (prev == null) return null;
    //check for head
    if (prev.equals(head)) prev.setNext(null);
    //check for end of list
    if (current == null) {
        head = prev;
        return head;
   }
   //Save next link
   Node temp = current.getNext();
   //Reverse link
   current.setNext(previous);
   //Recursive call
   reverse(curr, temp);
   return null;
}
