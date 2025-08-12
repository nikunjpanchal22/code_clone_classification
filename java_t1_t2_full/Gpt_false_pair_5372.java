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
    cellNew.setComment (cellOld.getComment ());
    Integer hash = cellOld.getStyle ().hashCode ();
    if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {
        this.transform (workbookOld, workbookNew, hash, cellOld.getStyle (), (XSSFCellStyle) workbookNew.createStyle ());
    }
    cellNew.setStyle (this.styleMap.get (hash));
    switch (cellOld.getType ()) {
        case Cell.TYPE_BLANK :
            break;
        case Cell.TYPE_BOOLEAN :
            cellNew.setValue (cellOld.getBooleanValue ());
            break;
        case Cell.TYPE_ERROR :
            cellNew.setErrorValue (cellOld.getErrorValue ());
            break;
        case Cell.TYPE_FORMULA :
            cellNew.setFormula (cellOld.getFormula ());
            break;
        case Cell.TYPE_NUMERIC :
            cellNew.setNumber (cellOld.getNumericValue ());
            break;
        case Cell.TYPE_STRING :
            cellNew.setText (cellOld.getStringValue ());
            break;
        default :
            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getType ());
    }
}
