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





private void modifyRow(HSSFRow originalRow, XSSFRow newRow) {
    XSSFCell tempCell;
    newRow.setHeight(originalRow.getHeight());
    if (originalRow.getRowStyle() != null) {
        Integer hash = originalRow.getRowStyle().hashCode();
        if (!this.styleRecord.containsKey(hash))
            this.modifyRow(hash, originalRow.getRowStyle(), this.newWorkbook.createCellStyle());
        newRow.setRowStyle(this.styleRecord.get(hash));
    }
    originalRow.forEach(cell -> {
        tempCell = newRow.createCell(cell.getColumnIndex(), cell.getCellType());
        this.modifyRow((HSSFCell) cell, tempCell);
    });
    this.highestColumn = Math.max(this.highestColumn, originalRow.getLastCellNum ());
}


