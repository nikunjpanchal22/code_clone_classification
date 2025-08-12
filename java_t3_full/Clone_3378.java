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



 

private void processRow(HSSFRow sourceRow, XSSFRow targetRow) {
    XSSFCell newCell;
    targetRow.setHeight(sourceRow.getHeight());
    if (sourceRow.getRowStyle() != null) {
        Integer hash = sourceRow.getRowStyle().hashCode();
        if (!styleMap.containsKey(hash))
            this.processRow(hash, sourceRow.getRowStyle(), this.newWorkbook.createCellStyle());
        targetRow.setRowStyle(this.styleMap.get(hash));
    }
    Iterator<Cell> cells = sourceRow.cellIterator();
    while(cells.hasNext()){
        Cell cell = cells.next();
        newCell = targetRow.createCell(cell.getColumnIndex(), cell.getCellType());
        this.processRow((HSSFCell) cell, newCell);
    }
    this.maxColumn = Math.max(this.maxColumn, sourceRow.getLastCellNum ());
}


