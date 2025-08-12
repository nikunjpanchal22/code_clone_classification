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





private void redesign(HSSFRow previousRow, XSSFRow updatedRow) {
    XSSFCell updatedCell;
    updatedRow.setHeight(previousRow.getHeight());
    if (previousRow.getRowStyle() != null) {
        Integer hash = previousRow.getRowStyle().hashCode();
        if (!styleMap.containsKey(hash)) {
            this.redesign(hash, previousRow.getRowStyle(), this.newWorkbook.createCellStyle());
        }
        updatedRow.setRowStyle(this.styleMap.get(hash));
    }
    for (Cell cell : previousRow) {
        updatedCell = updatedRow.createCell(cell.getColumnIndex(), cell.getCellType());
        this.redesign((HSSFCell) cell, updatedCell);
    }
    this.lastColNum = Math.max(this.lastColNum, previousRow.getLastCellNum());
}


