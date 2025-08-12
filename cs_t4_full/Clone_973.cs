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


  private void AddNode(int valueToBeInserted, Node current)
    {
        if (valueToBeInserted < current.value && current.left == null)
        {
            Node newNode = new Node(valueToBeInserted);
            current.left = newNode;
        }
        else if (valueToBeInserted > current.value && current.right == null)
        {
            Node newNode = new Node(valueToBeInserted);
            current.right = newNode;
        }
        else 
        {
            if (valueToBeInserted < current.value)
                AddNode(valueToBeInserted, current.left);
            else 
            {
                AddNode(valueToBeInserted, current.right);
            }
        }
}


