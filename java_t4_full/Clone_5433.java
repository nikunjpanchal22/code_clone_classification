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
        TableColumn tc = (TableColumn) hiddenColumns.get (columnName);
        hiddenColumns.remove (columnName);
        tcm.addColumn (tc);

        Object colObj = hiddenColumns.remove (":" + columnName);
        if(colObj != null){
            int column = ((Integer) colObj).intValue ();
            if (column < tcm.getColumnCount () - 1) {
                tcm.moveColumn (tcm.getColumnCount () - 1, column);
            }
        }
    }
}

