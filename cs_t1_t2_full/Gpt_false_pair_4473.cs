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
    int index;
    if (parent != null) {
        index = parent.Nodes.IndexOf (node);
        if (index < parent.Nodes.Count - 1) {
            parent.Nodes.RemoveAt (index);
            parent.Nodes.Insert (index + 1, node);
        }
    } else if (view != null && view.Nodes.Contains (node)) {
        index = view.Nodes.IndexOf (node);
        if (index < view.Nodes.Count - 1) {
            view.Nodes.RemoveAt (index);
            view.Nodes.Insert (index + 1, node);
        }
    }
}
