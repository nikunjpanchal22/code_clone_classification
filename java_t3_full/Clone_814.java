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



 protected void exportDone (JComponent c, Transferable data, int action) { if (action == MOVE) {
        DefaultListModel model = (DefaultListModel) source.getModel();
        int[] reversedIndices = new int[indices.length];
        int index = indices.length - 1;
        for (int i = 0; i < indices.length; i++) {
            reversedIndices[index--] = indices[i];
        }
        for (int i : reversedIndices) {
            model.remove(i);
        }
    }
    if (addCount > 0) {
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] > addIndex) {
                indices[i] += addCount;
            }
        }
    }
    indices = null;
    addIndex = -1;
    addCount = 0;
}


