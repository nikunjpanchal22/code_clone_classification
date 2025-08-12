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





private void migrateRow(HSSFRow existingRow, XSSFRow newRow) {
    XSSFCell newCell;
    newRow.setHeight(existingRow.getHeight());
    if (existingRow.getRowStyle() != null) {
        Integer key = existingRow.getRowStyle().hashCode();
        if (!styleHash.containsKey(key)) this.migrateRow(key, existingRow.getRowStyle(), this.updatedWorkbook.createCellStyle ());
        newRow.setRowStyle(this.styleHash.get(key));
    }
    existingRow.forEach(cell -> {
        newCell = newRow.createCell(cell.getColumnIndex(), cell.getCellType());


this.migrateRow((HSSFCell) cell, newCell);
    });
    this.endColumn = Math.max(this.endColumn, existingRow.getLastCellNum ());
}


