private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow rowNew) {
    XSSFCell cellNew;
    rowNew.setHeight (rowOld.getHeight ());
    for (Cell cell : rowOld) {
        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
        if (cellNew != null) this.transform (workbookOld, workbookNew, (HSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}


 private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow rowNew) {XSSFCell cellNew;
    lastColumn = Math.max(this.lastColumn, rowOld.getLastCellNum());
    rowNew.setHeight(rowOld.getHeight());
    for (int colIndex = 0; colIndex < rowOld.getLastCellNum(); colIndex++) {
        HSSFCell cell = rowOld.getCell(colIndex);
        cellNew = rowNew.createCell(cell.getColumnIndex(), cell.getCellType()); 
        if (cellNew != null) {
            transform(workbookOld, workbookNew, (HSSFCell) cell, cellNew);
        }
    } 
}


