public static void MoveUp (this TreeNode node) {
    TreeNode parent = node.Parent;
    TreeView view = node.TreeView;
    if (parent != null) {
        int index = parent.Nodes.IndexOf (node);
        if (index > 0) {
            parent.Nodes.RemoveAt (index);
            parent.Nodes.Insert (index - 1, node);
        }
    } else if (node.TreeView.Nodes.Contains (node)) {
        int index = view.Nodes.IndexOf (node);
        if (index > 0) {
            view.Nodes.RemoveAt (index);
            view.Nodes.Insert (index - 1, node);
        }
    }
}



public static void MoveUp (this TreeNode node) {
    TreeNode parent = node.Parent;
    TreeView view = node.TreeView;
    if (parent != null) {
        int index = parent.Nodes.IndexOf (node);
        if (index > 0) {
            parent.Nodes.RemoveAt (index);
            parent.Nodes.InsertBefore (parent.Nodes.ElementAt (index - 1), node);
        }
    } else if (view.Nodes.Contains (node)) {
        int index = view.Nodes.IndexOf (node);
        if (index > 0) {
            view.Nodes.RemoveAt (index);
            view.Nodes.InsertBefore (view.Nodes.ElementAt (index - 1), node);
        }
    }
}
