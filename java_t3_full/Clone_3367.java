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
    for (Iterator<Cell> cells = rowOld.cellIterator(); cells.hasNext();) {
        Cell cell = cells.next();
        XSSFCell newCell = rowNew.createCell(cell.getColumnIndex(), cell.getCellType());
        if (newCell != null)
            this.transform(workbookOld, workbookNew, (HSSFCell) cell, newCell);
    }
    this.lastColumn = Math.max(this.lastColumn, rowOld.getLastCellNum());
}


