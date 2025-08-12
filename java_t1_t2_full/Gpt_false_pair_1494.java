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


 public void inOrder() {
        if (m_root == null) {
            return;
        }
        Deque<BSTNode> myDeque = new ArrayDeque<BSTNode>();
        BSTNode current = m_root;
        while (current != null) {
            myDeque.addFirst(current);
            current = current.getLeft();
        }
        while (! myDeque.isEmpty()) {
            current = (BSTNode) myDeque.removeFirst();
            System.out.print(current.getInfo() + " ");
            if (current.getRight() != null) {
                current = current.getRight();
                while (current != null) {
                    myDeque.addFirst(current);
                    current = current.getLeft();
                }
            }
        }
}
