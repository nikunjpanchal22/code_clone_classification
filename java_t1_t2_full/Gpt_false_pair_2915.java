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
    //setting the comment
    cellNew.setCellComment(cellOld.getCellComment());
    //hash for holding the old cell style
    Integer hash = cellOld.getCellStyle().hashCode();
    //check if styleMap already contains the hash
    if(this.styleMap !=null && !this.styleMap.containsKey(hash))
    {
        //transform the old cell style to the new cell style
        this.transform(workbookOld, workbookNew, hash, cellOld.getCellStyle(), (HSSFCellStyle)workbookNew.createCellStyle());
    }
    //set the new cell style
    cellNew.setCellStyle(this.styleMap.get(hash));
    //determine the type of the old cell
    switch (cellOld.getCellType())
    {
        case Cell.CELL_TYPE_BLANK:
            break;
        case Cell.CELL_TYPE_BOOLEAN:
            cellNew.setCellValue(cellOld.getBooleanCellValue());
            break;
        case Cell.CELL_TYPE_ERROR:
            cellNew.setCellValue(cellOld.getErrorCellValue());
            break;
        case Cell.CELL_TYPE_FORMULA:
            cellNew.setCellValue(cellOld.getCellFormula());
            break;
        case Cell.CELL_TYPE_NUMERIC:
            cellNew.setCellValue(cellOld.getNumericCellValue());
            break;
        case Cell.CELL_TYPE_STRING:
            cellNew.setCellValue(cellOld.getStringCellValue());
            break;
        default:
            System.out.println("transform: Unbekannter Zellentyp " + cellOld.getCellType());
    }
}
