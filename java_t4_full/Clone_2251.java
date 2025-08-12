private void expandAllNodes (JTree tree) {
    int j = tree.getRowCount ();
    int i = 0;
    while (i < j) {
        tree.expandRow (i);
        i += 1;
        j = tree.getRowCount ();
    }
}


 private void expandAllNodes (JTree tree) {
    TreeNode root = (TreeNode) tree.getModel().getRoot();
    Enumeration e = root.children();
    while (e.hasMoreElements()) {
        TreeNode node = (TreeNode) e.nextElement();
        TreePath tp = new TreePath(node.getPath());
        tree.expandRow (tree.getRowForPath(tp));
    }
}


