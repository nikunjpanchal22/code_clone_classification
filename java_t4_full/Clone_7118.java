private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow rowNew) {
    XSSFCell cellNew;
    rowNew.setHeight (rowOld.getHeight ());
    for (Cell cell : rowOld) {
        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
        if (cellNew != null) this.transform (workbookOld, workbookNew, (HSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}





private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFRow rowOld, XSSFRow rowNew) {
    for (int i=0; i < rowOld.getPhysicalNumberOfCells(); i++) {
        XSSFCell cellNew = rowNew.createCell(i, rowOld.getCell(i).getCellType());
        if (cellNew != null) this.transform (workbookOld, workbookNew, rowOld.getCell(i), cellNew);
    }
    rowNew.setHeight(rowOld.getHeight());
    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum());
}


