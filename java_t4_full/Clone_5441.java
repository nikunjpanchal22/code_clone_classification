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
    hiddenColumns.remove(columnName)
        .ifPresent(o -> {
                 tcm.addColumn((TableColumn) o);
                 tcm.moveColumn(tcm.getColumnCount() - 1, ((Integer) hiddenColumns.remove(":" + columnName)).intValue());
               }
        );
}


