private void transform (HSSFCell cellOld, XSSFCell cellNew) {
    cellNew.setCellComment (cellOld.getCellComment ());
    Integer hash = cellOld.getCellStyle ().hashCode ();
    if (! this.styleMap.containsKey (hash)) {
        this.transform (hash, cellOld.getCellStyle (), this.workbookNew.createCellStyle ());
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


private void transform (HSSFCell cellOld, XSSFCell cellNew) {
    cellNew.setCellComment(cellOld.getCellComment());
    int styleKey = cellOld.getCellStyle().hashCode();
    this.styleMap.computeIfAbsent(styleKey, k -> this.transformStyle(cellOld.getCellStyle(), workbookNew.createCellStyle()));
    cellNew.setCellStyle(this.styleMap.get(styleKey));
    this.setValueByType(cellOld, cellNew);
}


