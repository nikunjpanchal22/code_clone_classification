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
    Object o = hiddenColumns.remove (columnName);
    tcm.addColumn((TableColumn) o);
    int column = ((Integer) hiddenColumns.remove (":" + columnName)).intValue ();
    int lastColumn = tcm.getColumnCount() - 1;
    tcm.moveColumn(lastColumn > column ? lastColumn : column, lastColumn < column ? lastColumn : column);
}


