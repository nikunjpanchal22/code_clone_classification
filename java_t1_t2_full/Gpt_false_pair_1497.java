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
        Set < BSTNode > mySet = new TreeSet < BSTNode > ();
        BSTNode current = m_root;
        while (current != null) {
            mySet.add(current);
            current = current.getLeft();
        }
        for (BSTNode node: mySet) {
            System.out.print(node.getInfo() + " ");
            if (node.getRight() != null) {
                current = node.getRight();
                while (current != null) {
                    mySet.add(current);
                    current = current.getLeft();
                }
            }
        }
}
