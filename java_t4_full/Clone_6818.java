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
    if (tree != null) {
        for(int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }
    }
}


