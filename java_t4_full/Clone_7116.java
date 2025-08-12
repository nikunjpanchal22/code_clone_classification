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
    Iterator<Cell> cellIterator = rowOld.iterator();
    while (cellIterator.hasNext()) {
        Cell cell = cellIterator.next();
        XSSFCell cellNew = rowNew.createCell(cell.getColumnIndex(), cell.getCellType());
        if (cellNew != null) this.transform(workbookOld, workbookNew, (HSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max(this.lastColumn, rowOld.getLastCellNum());
}


