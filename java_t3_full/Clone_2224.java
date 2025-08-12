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
    for (int colNo = 0; colNo < rowOld.getLastCellNum(); colNo++) {
        XSSFCell oldCell = rowOld.getCell(colNo);
        cellNew = rowNew.createCell(oldCell.getColumnIndex(), oldCell.getCellType());
        this.transform(workbookOld, workbookNew, (HSSFCell) oldCell, cellNew);
    }
    this.lastColumn = Math.max(this.lastColumn, rowOld.getLastCellNum());
}


