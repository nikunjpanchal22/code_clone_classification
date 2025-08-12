private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow rowOld, HSSFRow rowNew) {
    HSSFCell cellNew;
    rowNew.setHeight (rowOld.getHeight ());
    for (Cell cell : rowOld) {
        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
        if (cellNew != null) this.transform (workbookOld, workbookNew, (XSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}


 private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFRow rowOld, HSSFRow rowNew) {HSSFCell cellNew = null; 
    rowNew.setHeight (rowOld.getHeight ()); 
    int lastCol = 0; 
    for (Cell cell : rowOld) {
        lastCol = cell.getColumnIndex (); 
        cellNew = rowNew.createCell (lastCol, cell.getCellType ());
        if (cellNew != null)
            this.transform (workbookOld, workbookNew, (XSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max (this.lastColumn, lastCol);
}


