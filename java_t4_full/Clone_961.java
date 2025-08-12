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
        BSTNode current = m_root;
        inOrder(current);
    }
     
    private void inOrder(BSTNode root) { 
		String str="";
        if (root == null) 
            return;		
        inOrder(root.getLeft()); 
        str+=Integer.toString(root.getInfo());
        System.out.print(str + " ");
        inOrder(root.getRight());
}


