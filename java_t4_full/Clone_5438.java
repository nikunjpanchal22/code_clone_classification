public void show (String columnName) {
    Object o = hiddenColumns.remove (columnName);
    if (o == null) {
        return;
    }
    tcm.addColumn ((TableColumn) o);
    o = hiddenColumns.remove (":" + columnName);
    if (o == null) {
        return;
    }
    int column = ((Integer) o).intValue ();
    int lastColumn = tcm.getColumnCount () - 1;
    if (column < lastColumn) {
        tcm.moveColumn (lastColumn, column);
    }
}



public void show (String columnName) {
    if(hiddenColumns.containsKey(columnName)){
        tcm.addColumn ((TableColumn) hiddenColumns.get (columnName));
        int column = ((Integer) hiddenColumns.remove (":" + columnName)).intValue ();
        tcm.moveColumn (tcm.getColumnCount () - (tcm.getColumnCount () <= column ? 0 : 1), column);
        hiddenColumns.remove (columnName);
    }
}


