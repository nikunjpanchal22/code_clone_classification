protected void exportDone (JComponent c, Transferable data, int action) {
    if ((action == MOVE) && (indices != null)) {
        DefaultListModel model = (DefaultListModel) source.getModel ();
        for (int i = indices.length - 1;
        i >= 0; i --) model.remove (indices [i]);
    }
    if (addCount > 0) {
        for (int i = 0;
        i < indices.length; i ++) {
            if (indices [i] > addIndex) {
                indices [i] += addCount;
            }
        }
    }
    indices = null;
    addIndex = - 1;
    addCount = 0;
}





protected void exportDone(JComponent c, Transferable data, int action) {
    if (indices == null) return;
    DefaultListModel model = (DefaultListModel) source.getModel();
    Arrays.stream(indices).filter(i -> (action == MOVE) && i >= 0).forEach(model::remove);
    IntStream.range(0, indices.length).filter(i -> indices[i] > addIndex).forEach(i -> indices[i] += addCount);
    resetIndices();
}


