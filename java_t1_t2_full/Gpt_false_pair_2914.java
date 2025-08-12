private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFCell cellOld, HSSFCell cellNew) {
    cellNew.setCellComment (cellOld.getCellComment ());
    Integer hash = cellOld.getCellStyle ().hashCode ();
    if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {
        this.transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), (HSSFCellStyle) workbookNew.createCellStyle ());
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


  private void transform (XSSFWorkbook workbookOld, HSSFWorkbook workbookNew, XSSFCell cellOld, HSSFCell cellNew) {
    //copy the cell comment from old to new cell
    cellNew.setCellComment (cellOld.getCellComment ());
    //hash the existing cell style
    Integer hash = cellOld.getCellStyle ().hashCode ();
    //check if there is an entry in the styleMap 
    if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {
        //transform the old cell style to a new cell style
        this.transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), (HSSFCellStyle) workbookNew.createCellStyle ());
    }
    //embed the new cell style
    cellNew.setCellStyle (this.styleMap.get (hash));
    //determine the type of the old cell
    switch (cellOld.getCellType ()) {
        //check if cell is blank
        case Cell.CELL_TYPE_BLANK :
            break;
        //check if cell is boolean
        case Cell.CELL_TYPE_BOOLEAN :
            cellNew.setCellValue (cellOld.getBooleanCellValue ());
            break;
        //check if cell is an error
        case Cell.CELL_TYPE_ERROR :
            cellNew.setCellValue (cellOld.getErrorCellValue ());
            break;
        //check if cell is a formula
        case Cell.CELL_TYPE_FORMULA :
            cellNew.setCellValue (cellOld.getCellFormula ());
            break;
        //check if cell is a number
        case Cell.CELL_TYPE_NUMERIC :
            cellNew.setCellValue (cellOld.getNumericCellValue ());
            break;
        //check if cell is a string
        case Cell.CELL_TYPE_STRING :
            cellNew.setCellValue (cellOld.getStringCellValue ());
            break;
        //otherwise
        default :
            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getCellType ());
    }
}
