private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFCell cellOld, XSSFCell cellNew) {
    cellNew.setCellComment (cellOld.getCellComment ());
    Integer hash = cellOld.getCellStyle ().hashCode ();
    if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {
        this.transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), (XSSFCellStyle) workbookNew.createCellStyle ());
    }
    cellNew.setCellStyle (this.styleMap.get (hash));
    switch (cellOld.getCellType ()) {
        case Cell.CELL_TYPE_BLANK :
            break;
        case Cell.CELL_TYPE_BOOLEAN :
            cellNew.setCellValue (cellOld.getBooleanCellValue ());
            break;
        case Cell.CELL_TYPE_ERROR :
            cellNew.setCellValue (cellOld.getErrorCellValue ());
            break;
        case Cell.CELL_TYPE_FORMULA :
            cellNew.setCellValue (cellOld.getCellFormula ());
            break;
        case Cell.CELL_TYPE_NUMERIC :
            cellNew.setCellValue (cellOld.getNumericCellValue ());
            break;
        case Cell.CELL_TYPE_STRING :
            cellNew.setCellValue (cellOld.getStringCellValue ());
            break;
        default :
            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getCellType ());
    }
}


 

private void transform (HSSFWorkbook workbookOld, XSSFWorkbook workbookNew, HSSFCell cellOld, XSSFCell cellNew) {
            cellNew.setCellType(cellOld.getCellType());
            cellNew.setCellComment (cellOld.getCellComment ());
            Integer hash = cellOld.getCellStyle ().hashCode ();
            if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {
                this.transform (workbookOld, workbookNew, hash, cellOld.getCellStyle ());
            }
            cellNew.setCellStyle (workbookNew.getCellStyleAt(hash));
        
        if(cellOld.getCellType() == Cell.CELL_TYPE_STRING) {
            cellNew.setCellValue (cellOld.getRichStringCellValue ().getString());
        } else if(cellOld.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            cellNew.setCellValue(cellOld.getNumericCellValue());
        } else if(cellOld.getCellType() == Cell.CELL_TYPE_FORMULA) {
            cellNew.setCellFormula(cellOld.getCellFormula());
        } else if(cellOld.getCellType() == Cell.CELL_TYPE_ERROR) {
            cellNew.setCellValue(cellOld.getErrorCellValue());
        } else if(cellOld.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
            cellNew.setCellValue(cellOld.getBooleanCellValue());
        }
}


