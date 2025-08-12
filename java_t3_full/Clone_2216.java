private void transform (HSSFRow rowOld, XSSFRow rowNew) {
    XSSFCell cellNew;
    rowNew.setHeight (rowOld.getHeight ());
    if (rowOld.getRowStyle () != null) {
        Integer hash = rowOld.getRowStyle ().hashCode ();
        if (! this.styleMap.containsKey (hash)) this.transform (hash, rowOld.getRowStyle (), this.workbookNew.createCellStyle ());
        rowNew.setRowStyle (this.styleMap.get (hash));
    }
    for (Cell cell : rowOld) {
        cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
        if (cellNew != null) this.transform ((HSSFCell) cell, cellNew);
    }
    this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}



    private void transform (HSSFRow rowOld, XSSFRow rowNew) {
        XSSFCell cellNew;
        int colIndex = 0;
        rowNew.setHeight (rowOld.getHeight ());
        if (rowOld.getRowStyle () != null) {
            Integer hash = rowOld.getRowStyle ().hashCode ();
            if (! this.styleMap.containsKey (hash)) this.transform (hash, rowOld.getRowStyle (), this.workbookNew.createCellStyle ());
            rowNew.setRowStyle (this.styleMap.get (hash));
        }
        do {
            HSSFCell cell = rowOld.getCell(colIndex);
            cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
            if (cellNew != null) this.transform (cell, cellNew);
            colIndex++;
        } while (colIndex <= rowOld.getLastCellNum()); 
        this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}


