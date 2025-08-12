public static void MoveDown (this TreeNode node) {
    TreeNode parent = node.Parent;
    TreeView view = node.TreeView;
    if (parent != null) {
        int index = parent.Nodes.IndexOf (node);
        if (index < parent.Nodes.Count - 1) {
            parent.Nodes.RemoveAt (index);
            parent.Nodes.Insert (index + 1, node);
        }
    } else if (view != null && view.Nodes.Contains (node)) {
        int index = view.Nodes.IndexOf (node);
        if (index < view.Nodes.Count - 1) {
            view.Nodes.RemoveAt (index);
            view.Nodes.Insert (index + 1, node);
        }
    }
}


 public static void MoveDown (this TreeNode node) {
    TreeNode parent = node.Parent;
    TreeView view = node.TreeView;

    if (parent != null)
    {
        int index = parent.Nodes.IndexOf (node);
        if (index < parent.Nodes.Count - 1)
        {
            TreeNode tempNode = parent.Nodes[index+1];
            parent.Nodes.RemoveAt(index);
            parent.Nodes.Insert(index + 1, node);
            parent.Nodes.RemoveAt(index+2);
            parent.Nodes.Insert(index, tempNode);
        }
    }
    else if (view != null && view.Nodes.Contains(node))
    {
        int index = view.Nodes.IndexOf(node);
        if (index < view.Nodes.Count - 1)
        {
            TreeNode tempNode = view.Nodes[index+1];
            view.Nodes.RemoveAt(index);
            view.Nodes.Insert(index + 1, node);
            view.Nodes.RemoveAt(index+2);
            view.Nodes.Insert(index, tempNode);
        }
    }
}


