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
    //set the comment
    cellNew.setCellComment (cellOld.getCellComment ());
    //generate a hash code
    Integer hash = cellOld.getCellStyle ().hashCode ();
    //check if the styleMap has the hash
    if (this.styleMap != null && ! this.styleMap.containsKey (hash)) {
        //transform the old cell style to the new cell style
        this.transform (workbookOld, workbookNew, hash, cellOld.getCellStyle (), (HSSFCellStyle) workbookNew.createCellStyle ());
    }
    //set the new cell style
    cellNew.setCellStyle (this.styleMap.get(hash));
    //check the type of the old cell
    switch (cellOld.getCellType ()) {
        case Cell.CELL_TYPE_BLANK :
            break;
        //check if cell is boolean
        case Cell.CELL_TYPE_BOOLEAN :
            //set the new cell value to the old cell's boolean value
            cellNew.setCellValue (cellOld.getBooleanCellValue ());
            break;
        //check if cell is an error
        case Cell.CELL_TYPE_ERROR :
            //set the new cell value to the old cell's error value
            cellNew.setCellValue (cellOld.getErrorCellValue ());
            break;
        //check if cell is a formula
        case Cell.CELL_TYPE_FORMULA :
            //set the new cell value to the old cell's formula
            cellNew.setCellValue (cellOld.getCellFormula ());
            break;
        //check if cell is a number
        case Cell.CELL_TYPE_NUMERIC :
            //set the new cell value to the old cell's numeric value
            cellNew.setCellValue (cellOld.getNumericCellValue ());
            break;
        //check if cell is a string
        case Cell.CELL_TYPE_STRING :
            //set the new cell value to the old cell's string value
            cellNew.setCellValue (cellOld.getStringCellValue ());
            break;
        //otherwise
        default:
            //print an error message
            System.out.println ("transform: Unbekannter Zellentyp " + cellOld.getCellType ());
    }
}
