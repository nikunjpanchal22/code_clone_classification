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





private void migrate(HSSFRow oldRow, XSSFRow newRow) {
    XSSFCell cell;
    newRow.setHeight(oldRow.getHeight());
    if (oldRow.getRowStyle() != null) {
        int key = oldRow.getRowStyle().hashCode();
        if (!styleMap.containsKey(key)) {
            this.migrate(key, oldRow.getRowStyle(), this.newWorkbook.createCellStyle());
        }
        newRow.setRowStyle(this.styleMap.get(key));
    }
    Iterator<Cell> cells = oldRow.iterator();
    while(cells.hasNext()){
        Cell eachCell = cells.next();
        cell = newRow.createCell(eachCell.getColumnIndex(), eachCell.getCellType());
        this.migrate((HSSFCell) eachCell, cell);
    }
    this.lastColumnIndex = Math.max(this.lastColumnIndex, oldRow.getLastCellNum());
}


