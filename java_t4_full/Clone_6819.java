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
    int rows = tree.getRowCount();
    for(int i = 0; i < rows; i++) {
        tree.expandRow(i);
    }
}


