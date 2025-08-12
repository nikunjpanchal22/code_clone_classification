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





private void convertRow(HSSFRow oldRow, XSSFRow newRow) {
    XSSFCell newCell;
    newRow.setHeight(oldRow.getHeight());
    if (oldRow.getRowStyle() != null) {
        int hash = oldRow.getRowStyle().hashCode();
        if (!this.styleMap.containsKey(hash)) {
            this.convertRow(hash, oldRow.getRowStyle(), this.workbookNew.createCellStyle ());
        }
        newRow.setRowStyle(this.styleMap.get(hash));
    }
    for (int i = 0; i < oldRow.getPhysicalNumberOfCells(); i++) {
        HSSFCell oldCell = oldRow.getCell(i);
        newCell = newRow.createCell(oldCell.getColumnIndex(), oldCell.getCellType());
        if (newCell != null) {
            this.convertRow(oldCell, newCell);
        }
    }
    this.lastCellNum = Math.max(this.lastCellNum, oldRow.getLastCellNum());
}


