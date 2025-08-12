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
    rowNew.setHeight(rowOld.getHeight());
    for (int colIdx = 0; colIdx < rowOld.getLastCellNum(); colIdx++) {
        XSSFCell cellOld = rowOld.getCell(colIdx);
        cellNew = rowNew.createCell(cellOld.getColumnIndex(), cellOld.getCellType());
        this.transform(workbookOld, workbookNew, (HSSFCell) cellOld, cellNew);
    }
    this.lastColumn = Math.max(this.lastColumn, rowOld.getLastCellNum());
}


