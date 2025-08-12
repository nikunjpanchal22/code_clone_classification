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


private void InsertNode (int valueToAdd, Node current) {
    if (valueToAdd < current.value) {
        if (current.left == null)
            current.left = new Node (valueToAdd);
        else
            InsertNode (valueToAdd, current.left);
    }
    if (valueToAdd > current.value) {
        if (current.right == null)
            current.right = new Node (valueToAdd);
        else
            InsertNode (valueToAdd, current.right);
    }
}
