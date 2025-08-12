private void AddNode (int valueToBeInserted, Node current) {
    if (valueToBeInserted < current.value) {
        if (current.left == null)
            current.left = new Node (valueToBeInserted);
        else
            AddNode (valueToBeInserted, current.left);
    }
    if (valueToBeInserted > current.value) {
        if (current.right == null)
            current.right = new Node (valueToBeInserted);
        else
            AddNode (valueToBeInserted, current.right);
    }
}


private void AddToTree (int valueToInclude, Node root) {
    if (valueToInclude < root.value) {
        if (root.left == null)
            root.left = new Node (valueToInclude);
        else
            AddToTree (valueToInclude, root.left);
    }
    if (valueToInclude > root.value) {
        if (root.right == null)
            root.right = new Node (valueToInclude);
        else
            AddToTree (valueToInclude, root.right);
    }
}
