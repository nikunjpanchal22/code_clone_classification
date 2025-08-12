private void expandAllNodes (JTree tree) {
    int j = tree.getRowCount ();
    int i = 0;
    while (i < j) {
        tree.expandRow (i);
        i += 1;
        j = tree.getRowCount ();
    }
}


   


private void expandAllNodes(JTree tree) {
    new TreePath(tree.getPathForRow(tree.getRowCount()-1));
    for (int i = 0; i < tree.getRowCount(); i++) {
        tree.expandRow(i);
    }
}


