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
            CellStyle rowStyle = rowOld.getRowStyle();
            if (rowStyle != null) {
                Integer hash = rowStyle.hashCode();

                if (!styleMap.containsKey(hash)) 
                    transform(hash, rowStyle, workbookNew.createCellStyle());

                rowNew.setRowStyle(styleMap.get(hash));
            }

            for (Cell cell : rowOld) {
                transferCell(cell, rowNew);
            }

            lastColumn = Math.max(lastColumn, rowOld.getLastCellNum());
        }

        private void transferCell(Cell oldCell, XSSFRow rowNew) {
            XSSFCell newCell = rowNew.createCell(oldCell.getColumnIndex(), oldCell.getCellType());
            if (newCell != null)
                transform((HSSFCell) oldCell, newCell);
}


