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
    Iterator<TreePath> iterator = tree.getBorderPathsIterator(null);
    while (iterator.hasNext()) {
        TreePath path = iterator.next();
        tree.expandPath(path);
    }
}


