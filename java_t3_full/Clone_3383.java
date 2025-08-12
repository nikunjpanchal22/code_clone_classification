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





private void translate(HSSFRow fromRow, XSSFRow toRow) {
    XSSFCell toCell;
    toRow.setHeight(fromRow.getHeight());
    if (fromRow.getRowStyle() != null) {
        Integer hashCode = fromRow.getRowStyle().hashCode();
        if (!this.styleContainer.containsKey(hashCode))
            this.translate(hashCode, fromRow.getRowStyle(), this.targetWorkbook.createCellStyle());
        toRow.setRowStyle(this.styleContainer.get(hashCode));
    }
    fromRow.forEach(cell -> {
        toCell = toRow.createCell(cell.getColumnIndex(), cell.getCellType());
        this.translate((HSSFCell) cell, toCell);
    });
    this.lastColumnIdx = Math.max(this.lastColumnIdx, fromRow.getLastCellNum());
}


