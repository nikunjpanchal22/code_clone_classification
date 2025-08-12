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
    if (valueToBeInserted < current.value) 
        current.left = current.left == null ? new Node(valueToBeInserted) : AddNode(valueToBeInserted, current.left);
    else if (valueToBeInserted > current.value)
        current.right = current.right == null ? new Node(valueToBeInserted) : AddNode(valueToBeInserted, current.right);
}


