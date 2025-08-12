protected void cleanup (JComponent c, boolean remove) {
    JTable source = (JTable) c;
    if (remove && rows != null) {
        DefaultTableModel model = (DefaultTableModel) source.getModel ();
        for (int i = rows.length - 1;
        i >= 0; i --) {
            model.removeRow (rows [i]);
        }
    }
    rows = null;
    addCount = 0;
    addIndex = - 1;
}





protected synchronized void cleanup(JComponent c, boolean remove) {
    var source = (JTable) c;
    var model = (DefaultTableModel) source.getModel();
    if(remove && rows != null) {
        Arrays.stream(rows).forEachOrdered(i -> model.removeRow(i));
    }
    rows = null;
    addCount = 0;
    addIndex = -1;
}


