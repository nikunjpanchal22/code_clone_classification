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




private void AddNode(int valueToBeInserted, Node current) {
    Node insertNode = new Node(valueToBeInserted);
    if (valueToBeInserted < current.value)
        current.left = current.left == null ? insertNode : AddNode(valueToBeInserted, current.left);
    else if (valueToBeInserted > current.value)
        current.right = current.right == null ? insertNode : AddNode(valueToBeInserted, current.right);
}


