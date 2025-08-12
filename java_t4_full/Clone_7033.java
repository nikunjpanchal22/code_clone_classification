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
    short minColIx = rowOld.getFirstCellNum();
    short maxColIx = rowOld.getLastCellNum();
    for (short colIx = minColIx; colIx < maxColIx; colIx++) {
        XSSFCell cell = rowNew.createCell(colIx, rowOld.getCell(colIx).getCellType());
        if (cell != null) this.transform(workbookOld, workbookNew, rowOld.getCell(colIx), cell);
    }
    this.lastColumn = Math.max(this.lastColumn, maxColIx);
}


