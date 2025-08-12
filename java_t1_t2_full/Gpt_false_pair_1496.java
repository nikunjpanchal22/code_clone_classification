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
        List < BSTNode > myList = new LinkedList < BSTNode > ();
        BSTNode current = m_root;
        while (current != null) {
            myList.add(current);
            current = current.getLeft();
        }
        while (! myList.isEmpty()) {
            current = (BSTNode) myList.remove(myList.size()-1);
            System.out.print(current.getInfo() + " ");
            if (current.getRight() != null) {
                current = current.getRight();
                while (current != null) {
                    myList.add(current);
                    current = current.getLeft();
                }
            }
        }
}
