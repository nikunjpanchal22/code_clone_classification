private void transform (HSSFRow rowOld, XSSFRow rowNew) {
    XSSFCell cellNew;
    rowNew.setHeight (rowOld.getHeight ());
    if (rowOld.getRowStyle () != null) {
        Integer hash = rowOld.getRowStyle ().hashCode ();
        if (! this.styleMap.containsKey (hash)) this.transform (hash, rowOld.getRowStyle (), this.workbookNew.createCellStyle ());
        rowNew.setRowStyle (this.styleMap.get (hash));
    }
    for (Cell cell : rowOld) {
        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
        if (cellNew != null) this.transform ((HSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}





private void changeRow (HSSFRow oldRow, XSSFRow newRow) {
    XSSFCell newCell;
    newRow.setHeight (oldRow.getHeight ());
    if (oldRow.getRowStyle () != null) {
        Integer hashKey = oldRow.getRowStyle ().hashCode ();
        if (! this.styles.containsKey (hashKey)) this.changeRow (hashKey, oldRow.getRowStyle (), this.workbookNew.createCellStyle ());
        newRow.setRowStyle (this.styles.get (hashKey));
    }
    oldRow.cellIterator().forEachRemaining(cell -> {
        newCell = newRow.createCell (cell.getColumnIndex (), cell.getCellType ());
        this.changeRow ((HSSFCell) cell, newCell);
    });
    this.largestColumn = Math.max (this.largestColumn, oldRow.getLastCellNum ());
}


