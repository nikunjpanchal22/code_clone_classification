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
        ListIterator<Cell> listIterator = rowOld.listIterator();
        rowNew.setHeight (rowOld.getHeight ());
        if (rowOld.getRowStyle () != null) {
            Integer hash = rowOld.getRowStyle ().hashCode ();
            if (! this.styleMap.containsKey (hash)) this.transform (hash, rowOld.getRowStyle (), this.workbookNew.createCellStyle ());
            rowNew.setRowStyle (this.styleMap.get (hash));
        }
        while (listIterator.hasNext()) {
            Cell cell = listIterator.next();
            cellNew = rowNew.createCell (cell.getColumnIndex (), cell.getCellType ());
            if (cellNew != null) this.transform ((HSSFCell) cell, cellNew);
        }
        this.lastColumn = Math.max (this.lastColumn, rowOld.getLastCellNum ());
}
