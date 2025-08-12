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



public void inOrder2 () {
    if (m_root == null) {
        return;
    }
    Stack < BSTNode > nodeStack = new Stack < BSTNode > ();
    BSTNode curNode = m_root;
    while (curNode != null) {
        nodeStack.push (curNode);
        curNode = curNode.getLeft ();
    }
    while (! nodeStack.isEmpty ()) {
        curNode = (BSTNode) nodeStack.pop ();
        System.out.print (curNode.getInfo () + " ");
        if (curNode.getRight () != null) {
            curNode = curNode.getRight ();
            while (curNode != null) {
                nodeStack.push (curNode);
                curNode = curNode.getLeft ();
            }
        }
    }
}
