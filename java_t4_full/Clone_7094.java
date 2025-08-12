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





private void transform(HSSFRow rowOld, XSSFRow rowNew) {
    rowNew.setHeight(rowOld.getHeight());
    Integer styleHash = (rowOld.getRowStyle() != null ? rowOld.getRowStyle().hashCode() : null);
    
    if (styleHash != null && !styleMap.containsKey(styleHash))
        this.transform(styleHash, rowOld.getRowStyle(), this.workbookNew.createCellStyle());
    if (styleHash != null)
        rowNew.setRowStyle(styleMap.get(styleHash));

    for (Cell cell : rowOld) {
        XSSFCell cellNew = rowNew.createCell(cell.getColumnIndex(), cell.getCellType());
        if (cellNew != null)
            this.transform((HSSFCell) cell, cellNew);
    }

    lastColumn = Math.max(lastColumn, rowOld.getLastCellNum());
}


