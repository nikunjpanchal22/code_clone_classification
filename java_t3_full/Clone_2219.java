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
        rowNew.setHeight (rowOld.getHeight ());
        rowOld.getRowStyle () != null ? 
            this.transform (rowOld.getRowStyle ().hashCode (), rowOld.getRowStyle (), this.workbookNew.createCellStyle ()) : null;
        rowNew.setRowStyle (this.styleMap.get (rowOld.getRowStyle ().hashCode ()));
        for (Cell cell : rowOld) {
            cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
            if (cellNew != null) this.transform ((HSSFCell) cell, cellNew);
        }
        this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}


