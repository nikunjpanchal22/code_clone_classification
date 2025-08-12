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
    int rowLastCellNum = rowOld.getLastCellNum();
    for (int index = 0; index < rowLastCellNum; index++) {
        HSSFCell oldCell = rowOld.getCell(index);
        cellNew = rowNew.createCell(oldCell.getColumnIndex(), oldCell.getCellType());
        this.transform(workbookOld, workbookNew, oldCell, cellNew);
    }
    this.lastColumn = Math.max(this.lastColumn, rowLastCellNum);
}


