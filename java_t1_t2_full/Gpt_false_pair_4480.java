public void inOrder () {
    if (m_root == null) {
        return;
    }
    Stack < BSTNode > myStack = new Stack < BSTNode > ();
    BSTNode current = m_root;
    while (current != null) {
        myStack.push (current);
        current = current.getLeft ();
    }
    while (! myStack.isEmpty ()) {
        current = (BSTNode) myStack.pop ();
        System.out.print (current.getInfo () + " ");
        if (current.getRight () != null) {
            current = current.getRight ();
            while (current != null) {
                myStack.push (current);
                current = current.getLeft ();
            }
        }
    }
}


public void inOrder () {
    if (m_root == null) {
        return;
    }
    Queue < BSTNode > myQueue = new LinkedList < BSTNode > ();
    BSTNode current = m_root;
    while (current != null) {
        myQueue.add (current);
        current = current.getLeft ();
    }
    while (! myQueue.isEmpty ()) {
        current = (BSTNode) myQueue.remove ();
        System.out.print (current.getInfo () + " ");
        if (current.getRight () != null) {
            current = current.getRight ();
            while (current != null) {
                myQueue.add (current);
                current = current.getLeft ();
            }
        }
    }
}
