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
    for (int row = 0; row < tree.getRowCount (); row++) {
        tree.expandRow (row);
    }
}


