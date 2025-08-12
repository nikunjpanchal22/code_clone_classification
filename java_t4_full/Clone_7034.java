private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow rowNew) {
    XSSFCell cellNew;
    rowNew.setHeight (rowOld.getHeight ());
    for (Cell cell : rowOld) {
        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
        if (cellNew != null) this.transform (workbookOld, workbookNew, (HSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}




private void transform(HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow rowNew) {
    rowNew.setHeight(rowOld.getHeight());
    int i = 0;
    while (i < rowOld.getLastCellNum()) {
        XSSFCell newCell = rowNew.createCell(i, rowOld.getCell(i).getCellType());
        if (newCell != null)
            this.transform(workbookOld, workbookNew, rowOld.getCell(i), newCell);
        i++;
    }
    this.lastColumn = Math.max(this.lastColumn, rowOld.getLastCellNum());
}


