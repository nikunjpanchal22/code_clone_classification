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


protected void cleanup(JComponent c, boolean remove) 
{
    JTable source = (JTable) c;
    if (remove && rows != null) 
    {
        DefaultTableModel model = (DefaultTableModel) source.getModel();
        for (int i = rows.length - 1; i >= 0; i--) 
        {
            model.removeRows(rows[i]);
        }
    }
    rows = null;
    addCount = 0;
    addIndex = -1;
}
