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
 	   TreeNode next = node.NextNode;
    	if (next != null) {
   	    node.Parent.Nodes.RemoveAt (node.Index);
  	   node.Parent.Nodes.Insert (next.Index, node);
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
            parent.Nodes.RemoveAt(index);
            parent.Nodes.Insert(index + 2, node);
        }
    }
    else if (view != null && view.Nodes.Contains(node))
    {
        int index = view.Nodes.IndexOf(node);
        if (index < view.Nodes.Count - 1)
        {
            view.Nodes.RemoveAt(index);
            view.Nodes.Insert(index + 2, node);
        }
    }
}
